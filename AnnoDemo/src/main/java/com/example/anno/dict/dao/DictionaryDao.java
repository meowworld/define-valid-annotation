package com.example.anno.dict.dao;

import com.example.anno.dict.domain.Dictionary;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface DictionaryDao {

    List<Dictionary> queryDic(String value);

}
