package com.example.anno.dict.service;

import com.example.anno.dict.domain.Dictionary;

import java.util.List;

public interface DictionaryService {

    List<Dictionary> queryDic(String key);

}
