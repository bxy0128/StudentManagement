package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import vo.Student;

public interface StudentMapper {
    List<vo.Student> SelectAllStudent();/*查询所有学生*/
    // unuse

    Student SelectStudentByCondition(Student student); /*根据学生条件查询学生*/

    void UpdateStudent(Student student); /*修改学生信息*/

    void DeleteStudent(int id); /*删除学生*/

    void InsertStudent(Student student); /*添加学生*/

    /*注解方式*/
    @Select("SELECT * FROM student  inner join  class on student.s_class = class.cid")
    @ResultMap("com.dao.StudentMapper.StudentResult")
    List<vo.Student> selectAll();/*查询所有学生*/

}
