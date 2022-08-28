package web.sandbox.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import web.sandbox.annotations.RequiredFieldConstraint;
import web.sandbox.model.dto.UserDTO;

public class BaseValidator implements ConstraintValidator<RequiredFieldConstraint, UserDTO> {

    Log LOGGER = LogFactory.getLog(BaseValidator.class);
    @Override
    public void initialize(RequiredFieldConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(UserDTO userDTO, ConstraintValidatorContext constraintValidatorContext) {
        LOGGER.info("[0242ac120002] validating user");
        if(userDTO == null) return false;
        else {
            return StringUtils.isNotBlank(userDTO.getFirstName()) && StringUtils.isNotBlank(userDTO.getLastName());
        }
    }
}
