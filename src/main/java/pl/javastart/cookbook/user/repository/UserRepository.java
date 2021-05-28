package pl.javastart.cookbook.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import pl.javastart.cookbook.user.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
    @Modifying
    void deleteUserById(Long id);

    Optional<User> findByUserName(String userName);

    Optional<User> findByEmailAddress(String emailAddress);

    Optional<User> findByPasswordResetKey(String passwordResetKey);
}
