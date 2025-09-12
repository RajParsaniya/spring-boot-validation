package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.StartsWith;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a given string starts with the specified prefix.
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class StartsWithValidator implements ConstraintValidator<StartsWith, String> {
    private String prefix;

    /**
     * Initializes the validator with the annotation-defined prefix value.
     *
     * @param annotation the {@link StartsWith} annotation instance containing the configuration.
     * @since 3.0.0
     */
    @Override
    public void initialize(final StartsWith annotation) {
        this.prefix = annotation.value();
    }

    /**
     * Checks whether the given string value starts with the specified prefix.
     *
     * @param value   the string value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or starts with the specified prefix, {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value == null || value.startsWith(this.prefix);
    }
}
