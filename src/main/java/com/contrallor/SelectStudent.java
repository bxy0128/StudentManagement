package com.contrallor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.service.Student.StudentService;

import vo.Student;

@WebServlet(name = "SelectStudent", value = "/SelectStudent")
public class SelectStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("utf-8");
        /*跨域请求设置*/
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        // 新建学生对象
        Student student = new Student();
        // 判断是否有id或者name
        if (request.getParameter("id") != null) {
            student.setId(Integer.parseInt(request.getParameter("id")));// 传入id
        }
        if (request.getParameter("name") != null) {
            student.setName(request.getParameter("name"));// 传入name
        }

        Student student1 = new StudentService().select(student);// 调用查询方法
        Gson gson = new Gson();// 创建gson对象
        String json = gson.toJson(student1);// 转为json
        response.getWriter().write(json);// 输出
    }
}
