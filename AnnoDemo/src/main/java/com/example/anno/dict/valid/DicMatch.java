package com.example.anno.dict.valid;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy =DicMatchValid.class )
public @interface DicMatch {

    String message() default "字典值不匹配";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};



}
