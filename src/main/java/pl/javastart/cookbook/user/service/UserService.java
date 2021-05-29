package pl.javastart.cookbook.user.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.javastart.cookbook.mail.service.MailService;
import pl.javastart.cookbook.user.model.Authority;
import pl.javastart.cookbook.user.model.Role;
import pl.javastart.cookbook.user.model.User;
import pl.javastart.cookbook.user.repository.UserRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final MailService mailService;

    public UserService(PasswordEncoder passwordEncoder, UserRepository userRepository, MailService mailService) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.mailService = mailService;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteUserById(id);
    }

    public void signUpUser(User userToSignUp) {
        userToSignUp.setPassword(passwordEncoder.encode(userToSignUp.getPassword()));
        List<Role> roles = Collections.singletonList(new Role(Authority.ROLE_USER, userToSignUp));
        userToSignUp.setRoles(new HashSet<>(roles));
        userRepository.save(userToSignUp);
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> findAllWithoutAuthenticated() {
        Authentication authenticatedUser = SecurityContextHolder.getContext().getAuthentication();
        return userRepository.findAll()
                .stream()
                .filter((User user) -> !user.getUserName().equals(authenticatedUser.getName()))
                .collect(Collectors.toList());
    }

    public void sendPasswordResetLink(String emailAddress) {
        String randomPasswordResetKey = UUID.randomUUID().toString();
        userRepository.findByEmailAddress(emailAddress).ifPresent(user -> {
            user.setPasswordResetKey(randomPasswordResetKey);
            userRepository.save(user);
            mailService.sendPasswordResetLink(emailAddress, randomPasswordResetKey);
        });
    }

    public void resetUserPassword(String passwordResetKey, String newPassword) {
        userRepository.findByPasswordResetKey(passwordResetKey).ifPresent(user -> {
            user.setPassword(passwordEncoder.encode(newPassword));
            user.setPasswordResetKey(null);
            userRepository.save(user);
        });
    }

    public void updateUserAccount(User userToModify) {
        userToModify.setPassword(passwordEncoder.encode(userToModify.getPassword()));
        userRepository.save(userToModify);
    }

}
