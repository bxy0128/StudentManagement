package com.contrallor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.Student.StudentService;

import vo.Student;

@WebServlet(name = "UpdateStudent", value = "/UpdateStudent")
public class UpdateStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");
        /*跨域请求设置*/
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        /**/
        // 创建学生对象
        Student student = new Student();
        student.setId(Integer.parseInt(request.getParameter("id")));
        student.setName(request.getParameter("name"));
        student.setS_class(Integer.parseInt(request.getParameter("s_class")));
        student.setAcj(Integer.parseInt(request.getParameter("Acj")));
        student.setCcj(Integer.parseInt(request.getParameter("Ccj")));
        student.setBcj(Integer.parseInt(request.getParameter("Bcj")));
        student.setLogo(request.getParameter("logo"));
        int i = new StudentService().update(student);// 调用修改方法
    }
}
