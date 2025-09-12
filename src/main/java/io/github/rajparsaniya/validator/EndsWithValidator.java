package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.EndsWith;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a given string ends with the specified suffix.
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class EndsWithValidator implements ConstraintValidator<EndsWith, String> {
    private String suffix;

    /**
     * Initializes the validator with the annotation-defined suffix value.
     *
     * @param annotation the {@link EndsWith} annotation instance containing the configuration.
     * @since 3.0.0
     */
    @Override
    public void initialize(final EndsWith annotation) {
        this.suffix = annotation.value();
    }

    /**
     * Checks whether the given string value ends with the specified suffix.
     *
     * @param value   the string value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or ends with the specified suffix, {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final String value, final ConstraintValidatorContext context) {
        return value == null || value.endsWith(this.suffix);
    }
}
