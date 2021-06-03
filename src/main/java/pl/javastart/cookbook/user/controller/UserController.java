package pl.javastart.cookbook.user.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.javastart.cookbook.user.dto.UserAccountDetailsToModifyDto;
import pl.javastart.cookbook.user.model.MyUserDetails;
import pl.javastart.cookbook.user.model.User;
import pl.javastart.cookbook.user.service.UserService;

import javax.validation.Valid;
import java.util.Optional;

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
        model.addAttribute("newUser", new User());
        return "signUpForm";
    }

    @PostMapping("/signUp")
    public String signUp(@Valid @ModelAttribute("newUser") User user,
                         BindingResult bindingResult,
                         Model model,
                         RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("newUser", user);
            return "signUpForm";
        } else {
            userService.signUpUser(user);
            redirectAttributes.addFlashAttribute("messageSignUpCompletedSuccessfully",
                    "Your account has ben created successfully! Please SIGN IN");
            return "redirect:/signIn";
        }
    }

    @GetMapping("/termsAndConditionsAgreement")
    public String getTermsAndConditionsAgreement() {
        return "termsAndConditionsAgreement";
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

    @GetMapping("/password/reset/link")
    public String getResetPasswordForm(@RequestParam String passwordResetKey, Model model) {
        model.addAttribute("passwordResetKey", passwordResetKey);
        return "resetPasswordForm";
    }

    @PostMapping("/password/reset/link")
    public String resetPassword(@RequestParam String passwordResetKey, @RequestParam String newPassword) {
        userService.resetUserPassword(passwordResetKey, newPassword);
        return "resetPasswordSuccessful";
    }

    @GetMapping("user/account/modify")
    public String getUserAccountModifyForm(Model model) {
        model.addAttribute("userAccountDetailsToModify", new UserAccountDetailsToModifyDto());
        return "userAccountModifyForm";
    }

    @PostMapping("/user/account/update")
    public String updateUserAccount(@Valid UserAccountDetailsToModifyDto userAccountDetailsToModify,
                                    BindingResult bindingResult,
                                    Model model,
                                    RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("userAccountDetailsToModify", userAccountDetailsToModify);
            return "userAccountModifyForm";
        } else {
            userService.updateUserAccountDetails(userAccountDetailsToModify);
            redirectAttributes.addFlashAttribute("messageUpdateAccountCompletedSuccessfully",
                    "Your account details have ben updated successfully! Please SIGN IN");
            return "redirect:/signIn";
        }
    }
}
