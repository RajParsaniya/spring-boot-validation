package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.StrongPassword;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a given string meets strong password requirements.
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, String> {

    /**
     * Checks whether the given string meets the strong password criteria.
     *
     * @param value   the string value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or satisfies the strong password rules, {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value == null || value.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }
}
