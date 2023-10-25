package com.service.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.StudentFactory;

import utils.DBConnection;
import vo.Student;

public class StudentService implements StudentFactory {
    private final DBConnection db = new DBConnection();// 创建数据库连接对象

    @Override
    public int delete(int id) {
        int i = db.getSession().delete("com.dao.StudentMapper.DeleteStudent", id);
        db.getSession().commit();
        System.out.println(i);
        db.close();
        return i;
    }

    @Override
    public int insert(Student student) {
        int i = db.getSession().insert("com.dao.StudentMapper.InsertStudent", student);
        db.getSession().commit();
        System.out.println(i);
        db.close();
        return i;
    }

    @Override
    public List<Student> selectALL(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Student> ls = db.getSession().selectList("com.dao.StudentMapper.selectAll");
        PageInfo<Student> pageInfo = new PageInfo<>(ls);
        System.out.println("总记录数：" + pageInfo.getTotal());
        System.out.println("总页数：" + pageInfo.getPages());
        System.out.println("一页的大小：" + pageInfo.getSize());
        Map<String, Object> map = null;
        List<Map<String, Object>> list = new ArrayList();
        for (Student student : ls) {
            map = new HashMap<>();
            map.put("id", student.getId());
            map.put("name", student.getName());
            map.put("class", student.getS_class());
            map.put("Acj", student.getAcj());
            map.put("Bcj", student.getBcj());
            map.put("Ccj", student.getCcj());
            map.put("logo", student.getLogo());
            map.put("Zcj", student.getAcj() + student.getBcj() + student.getCcj());
            map.put("class_name", student.getGrade().getCname());
            list.add(map);
        }
        System.out.println(pageInfo);
        System.out.println("我是分界线----------------------------------");

        db.close();
        return pageInfo.getList();
    }

    @Override
    public Student select(Student student) {
        Student student1 = db.getSession().selectOne("com.dao.StudentMapper.SelectStudentByCondition", student);
        db.getSession().commit();
        System.out.println(student1);
        db.close();
        return student1;
    }

    public int update(Student student) {
        int i = db.getSession().update("com.dao.StudentMapper.UpdateStudent", student);
        db.getSession().commit();
        System.out.println(i);
        db.close();
        return i;
    }

}
