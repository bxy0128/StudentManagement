package com.contrallor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import com.service.Student.StudentService;

import vo.Student;

@WebServlet(name = "SelectallStudent", value = "/SelectallStudent")
public class SelectallStudent extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        /*跨域请求设置*/
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST,GET,PUT,DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        /*配置分页处理*/
        int pageNum = Integer.parseInt(request.getParameter("pageNum"));
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        // 取值
        if (pageNum == 0) {
            pageNum = 1;// 默认第一页
        }
        List<Student> list = new StudentService().selectALL(pageNum, pageSize);// 调用查询所有学生信息的方法
        // 分页数据发送
        PageInfo<Student> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);
        // 转为json
        Gson gson = new Gson();// 创建gson对象
        String js = gson.toJson(pageInfo);// 转为json
        PrintWriter pw = response.getWriter();// 创建输出流
        pw.print(js);// 输出
        pw.flush();// 刷新
    }
}
