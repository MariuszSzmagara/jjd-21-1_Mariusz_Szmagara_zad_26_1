package pl.javastart.cookbook.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostalCodeValidator implements ConstraintValidator<PostalCode, String> {

    @Override
    public void initialize(PostalCode constraintAnnotation) {
    }

    @Override
    public boolean isValid(String postalCode, ConstraintValidatorContext context) {
        String regexPostalCodedRequirements = "^\\d{2}[- ]?\\d{3}$";
        Pattern pattern = Pattern.compile(regexPostalCodedRequirements);
        if (postalCode == null) {
            return false;
        } else {
            Matcher match = pattern.matcher(postalCode);
            return match.matches();
        }
    }
}
