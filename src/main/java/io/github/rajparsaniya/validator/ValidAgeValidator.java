package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.ValidAge;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Validates that a numeric age value is within the specified range.
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
public class ValidAgeValidator implements ConstraintValidator<ValidAge, Integer> {
    private int min;
    private int max;

    /**
     * Initializes the validator with the configured minimum and maximum age values.
     *
     * @param annotation the {@link ValidAge} annotation instance.
     * @since 3.0.0
     */
    @Override
    public void initialize(final ValidAge annotation) {
        this.min = annotation.min();
        this.max = annotation.max();
    }

    /**
     * Checks whether the given age is within the specified range.
     *
     * @param value   the age value to validate.
     * @param context context in which the constraint is evaluated.
     * @return {@code true} if the value is {@code null} or between {@code min} and {@code max}, inclusive {@code false} otherwise.
     * @since 3.0.0
     */
    @Override
    public boolean isValid(final Integer value, final ConstraintValidatorContext context) {
        return value == null || (value >= this.min && value <= this.max);
    }
}
