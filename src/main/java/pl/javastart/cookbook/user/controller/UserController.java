package pl.javastart.cookbook.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.javastart.cookbook.user.model.User;
import pl.javastart.cookbook.user.repository.UserRepository;

@Controller
public class UserController {

    private UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/user/all")
    public String getAllUsers(Model model) {
        model.addAttribute("allUsersList", userRepository.findAll());
        model.addAttribute("newUser", new User());
        return "allUsersList";
    }

    @PostMapping("/user/addNewUser")
    public String addNewUser(User user) {
        userRepository.save(user);
        return "redirect:/user/all";
    }

    @PostMapping("/user/{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteUserById(id);
        return "redirect:/user/all";
    }

}
