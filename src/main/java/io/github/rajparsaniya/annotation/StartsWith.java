package io.github.rajparsaniya.annotation;

import io.github.rajparsaniya.validator.StartsWithValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to validate that a string starts with the specified prefix.
 *
 * @author Raj Parsaniya
 * @since 3.0.0
 */
@Documented
@Constraint(validatedBy = StartsWithValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartsWith {

    /**
     * The required prefix the string must start with.
     *
     * @return the prefix.
     * @since 3.0.0
     */
    String value();

    /**
     * The error message that will be shown when validation fails.
     *
     * @return the validation error message.
     * @since 3.0.0
     */
    String message() default "must start with {value}";

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
