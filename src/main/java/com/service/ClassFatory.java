package com.service;

import java.util.List;

import vo.Student;

public interface ClassFatory {
    List<Student> select(int cid);
}
