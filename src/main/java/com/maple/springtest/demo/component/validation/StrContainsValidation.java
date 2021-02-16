package com.maple.springtest.demo.component.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Classname StrContainsValidation
 * @Description TODO
 * @Date 2021/2/16 11:36 上午
 * @Created by chenzhongzhi
 * @Version 1.0
 */
public class StrContainsValidation implements ConstraintValidator<StrContains, Object> {

    private String containsStr;

    @Override
    public void initialize(StrContains constraintAnnotation) {
        containsStr = constraintAnnotation.contains();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        try {
            String msg = String.valueOf(o);
            return msg.contains(containsStr);
        }catch (Exception e) {
            return false;
        }
    }
}
