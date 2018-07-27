package com.wangbin.dao;

import java.util.List;

import com.wangbin.model.Person;

public interface PersonMapper {

	/**
     * 插入一条记录
     * @param person
     */
    void insert(Person person);
    
    /**
     * 查询所有s
     * @return
     */
    List<Person> queryAll();
}
