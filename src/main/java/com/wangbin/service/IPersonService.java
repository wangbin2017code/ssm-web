package com.wangbin.service;

import java.util.List;

import com.wangbin.model.Person;

public interface IPersonService {

	/**
     * 加载全部的person
     * @return
     */
    List<Person> loadPersons();
}
