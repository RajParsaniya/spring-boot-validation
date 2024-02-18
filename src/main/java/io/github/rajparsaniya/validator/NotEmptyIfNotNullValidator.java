package io.github.rajparsaniya.validator;

import io.github.rajparsaniya.annotation.NotEmptyIfNotNull;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Objects;

public class NotEmptyIfNotNullValidator implements ConstraintValidator<NotEmptyIfNotNull, String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (Objects.isNull(s)) {
            return true;
        } else {
            return !s.isEmpty();
        }
    }
}
