package com.andikscript.databasemigration.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Constraint(validatedBy = GajiValueValidator.class)
@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GajiValue {

    String message() default "{com.andikscript.databasemigration.constraints.GajiValue.message}";

    Class<?> [] groups() default {};

    Class <? extends Payload> [] payload() default {};
}
