package io.github.rajparsaniya.annotation;

import io.github.rajparsaniya.validator.NumericOnlyValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to validate that a string contains only numeric digits (0–9).
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
@Documented
@Constraint(validatedBy = NumericOnlyValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface NumericOnly {

    /**
     * The error message that will be shown when validation fails.
     *
     * @return the validation error message.
     * @since 3.0.0
     */
    String message() default "must contain only digits";

    /**
     * Allows the specification of validation groups.
     *
     * @return the validation groups.
     * @since 3.0.0
     */
    Class<?>[] groups() default {};

    /**
     * Can be used by clients to assign custom payload objects to a constraint.
     *
     * @return the payload.
     * @since 3.0.0
     */
    Class<? extends Payload>[] payload() default {};
}
