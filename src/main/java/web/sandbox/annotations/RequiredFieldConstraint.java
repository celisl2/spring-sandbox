package web.sandbox.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import web.sandbox.validator.BaseValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = BaseValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiredFieldConstraint {
    String message() default "Missing required field";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
