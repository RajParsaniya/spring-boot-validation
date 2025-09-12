package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.NumericOnly;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a given string contains only numeric digits (0–9).
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class NumericOnlyValidator implements ConstraintValidator<NumericOnly, String> {

    /**
     * Checks whether the given string contains only digits.
     *
     * @param value   the string value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or contains only digits, {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value == null || value.matches("\\d+");
    }
}
