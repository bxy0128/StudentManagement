package com.service.Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.ClassFatory;

import utils.DBConnection;
import vo.Student;

public class ClassService implements ClassFatory {
    private final DBConnection db = new DBConnection();// 创建数据库连接对象

    @Override
    public List<Student> select(int cid) {
        PageHelper.startPage(1, 5);
        List<Student> ls = db.getSession().selectList("com.dao.ClassMapper.selectByClass", cid);
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
            list.add(map);
        }
        System.out.println(pageInfo);
        System.out.println("我是分界线----------------------------------");

        db.close();
        return pageInfo.getList();
    }
}
