package com.andikscript.databasemigration.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GajiValueValidator implements ConstraintValidator<GajiValue, Integer> {
    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        if (integer == null) {
            return false;
        }
        return integer > 1000000;
    }
}
