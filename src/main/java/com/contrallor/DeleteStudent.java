package com.contrallor;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.Student.StudentService;

@WebServlet(name = "DeleteStudent", value = "/DeleteStudent")
public class DeleteStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setCharacterEncoding("utf-8");/*跨域请求设置*/
        // 跨域请求，方便前后端分离的情况下调试
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        request.setAttribute("id", request.getParameter("id"));// 获取id
        int i = new StudentService().delete(Integer.parseInt(request.getParameter("id")));// 调用删除方法
        if (i == 1) {// 判断是否删除成功
            request.getRequestDispatcher("SelectallStudent").forward(request, response);// 跳转到查询所有学生信息的servlet
        }
    }
}
