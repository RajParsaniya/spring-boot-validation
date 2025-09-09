package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.NoSpecialCharacters;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a given string contains only alphanumeric characters (letters and digits).
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class NoSpecialCharactersValidator implements ConstraintValidator<NoSpecialCharacters, String> {

    /**
     * Checks whether the given string contains only alphanumeric characters.
     *
     * @param value   the string value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or contains only alphanumeric characters, {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value == null || value.matches("^[a-zA-Z0-9]+$");
    }
}
