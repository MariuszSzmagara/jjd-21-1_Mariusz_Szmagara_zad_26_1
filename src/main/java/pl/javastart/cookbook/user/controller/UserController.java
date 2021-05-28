package pl.javastart.cookbook.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.cookbook.user.model.User;
import pl.javastart.cookbook.user.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signIn")
    public String signIn() {
        return "signInForm";
    }

    @GetMapping("/signIn-error")
    public String signInError(Model model) {
        model.addAttribute("signInError", true);
        return "signInForm";
    }

    @GetMapping("/signUp")
    public String signUp(Model model) {
        model.addAttribute("user", new User());
        return "signUpForm";
    }

    @PostMapping("/signUp")
    public String signUp(User user) {
        userService.signUpUser(user);
        return "redirect:/signIn";
    }

    @GetMapping("/password/reset")
    public String getResetPasswordLinkForm() {
        return "resetPasswordLinkForm";
    }

    @PostMapping("/password/reset")
    public String sendResetPasswordLink(@RequestParam String emailAddress) {
        userService.sendPasswordResetLink(emailAddress);
        return "resetPasswordLinkSuccessful";
    }

    @GetMapping("password/reset/link")
    public String getResetPasswordForm(@RequestParam String passwordResetKey, Model model) {
        model.addAttribute("passwordResetKey", passwordResetKey);
        return "resetPasswordForm";
    }

    @PostMapping("/password/reset/link")
    public String resetPassword(@RequestParam String passwordResetKey, @RequestParam String newPassword) {
        userService.resetUserPassword(passwordResetKey, newPassword);
        return "resetPasswordSuccessful";
    }
}
