package com.example.anno.dict.service.impl;


import com.example.anno.dict.dao.DictionaryDao;
import com.example.anno.dict.domain.Dictionary;
import com.example.anno.dict.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryDao personDao;

    @Override
    public List<Dictionary> queryDic(String key) {

        List<Dictionary> list = personDao.queryDic(key);

        return list;
    }
}
