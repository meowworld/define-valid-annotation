package com.example.anno.dict.valid;

import com.example.anno.dict.dao.DictionaryDao;
import com.example.anno.dict.domain.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class DicMatchValid implements ConstraintValidator<DicMatch,String> {

    @Autowired
    private DictionaryDao dictionaryDao;

    @Override
    public void initialize(DicMatch constraintAnnotation) {
        System.out.println(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        List<Dictionary> list = dictionaryDao.queryDic(value);
        boolean match = list.stream().anyMatch(dict -> value.equals(dict.getValue()));

        return match;
    }


}
