package com.teligen.repository;

import com.teligen.entity.Student;

import java.util.Collection;

//对Student CRUD操作
public interface StudentRepository {
    Collection<Student>findAll();
    Student findById(long id);
    void saveOrUpdate(Student student);
    void deleteById(long id);

}
