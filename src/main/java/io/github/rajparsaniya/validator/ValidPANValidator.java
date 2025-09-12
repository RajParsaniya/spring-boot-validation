package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.ValidPAN;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a given string is a valid Indian Permanent Account Number (PAN).
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class ValidPANValidator implements ConstraintValidator<ValidPAN, String> {

    /**
     * Checks whether the given string is a valid PAN number.
     *
     * @param value   the string value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or matches the PAN format, {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value == null || value.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
    }
}
