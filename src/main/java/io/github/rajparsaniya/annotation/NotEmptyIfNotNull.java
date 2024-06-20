package io.github.rajparsaniya.annotation;

import io.github.rajparsaniya.validator.NotEmptyIfNotNullValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotEmptyIfNotNullValidator.class)
public @interface NotEmptyIfNotNull {
    String message() default "Value must not be empty if not null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
