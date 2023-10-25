package com.service;

import java.util.List;

import vo.Student;

public interface StudentFactory {
    int delete(int id);

    int insert(Student student);

    List<Student> selectALL(Integer pageNum, Integer pageSize);

    Student select(Student student);

    int update(Student student);

}
