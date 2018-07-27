package com.wangbin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangbin.dao.PersonMapper;
import com.wangbin.model.Person;
import com.wangbin.service.IPersonService;

@Service("personService")
public class PersonServiceImpl implements IPersonService {

	private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }
    @Autowired
    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public List<Person> loadPersons() {
        return personMapper.queryAll();
    }
}
