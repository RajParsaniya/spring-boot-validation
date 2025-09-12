package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.ValidPinCode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a given string is a valid Indian PIN code.
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class ValidPinCodeValidator implements ConstraintValidator<ValidPinCode, String> {

    /**
     * Checks whether the given string is a valid PIN code.
     *
     * @param value   the string value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or matches the PIN code format, {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value == null || value.matches("^[1-9][0-9]{5}$");
    }
}
