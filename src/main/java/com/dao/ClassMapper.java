package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface ClassMapper {
    List<vo.Class> SelectAllClass();// 查询所有班级

    @Select("SELECT * FROM student  inner join  class on student.s_class = class.cid where class.cid = #{cid}")
    @ResultMap("com.dao.StudentMapper.StudentResult")
    List<vo.Student> selectByClass(@Param("cid") int cid); /*查询班级内学生*/
}
