package pl.javastart.cookbook.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<Password, String> {

    @Override
    public void initialize(Password constraintAnnotation) {
    }

    @Override
    public boolean isValid(String password, ConstraintValidatorContext context) {
        String regexPasswordRequirements = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%&!-_]).*$";
        Pattern pattern = Pattern.compile(regexPasswordRequirements);
        if (password == null) {
            return false;
        } else {
            Matcher match = pattern.matcher(password);
            return match.matches();
        }
    }
}
