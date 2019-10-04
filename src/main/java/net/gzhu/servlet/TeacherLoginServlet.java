package net.gzhu.servlet;

import net.gzhu.bean.Teacher;
import net.gzhu.service.TeacherService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * -zzl.
 *
 * @author : zzl
 * @version : 1.0
 * @date : 2019-10-04 09:14
 */
public class TeacherLoginServlet extends HttpServlet {
    TeacherService ts = new TeacherService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //因为是账号密码，所以协议用安全的post
        String teacherId = request.getParameter("teacherId");
        String password = request.getParameter("password");

        //这里跳转到service层
        Teacher teacher = ts.teacherLogin(teacherId,password);
        System.out.println("teacher=" + teacher);

        if (teacher == null) {
            request.setAttribute("msg","教师登录：账号密码错误");
            //返回登录界面
            request.getRequestDispatcher("/TeacherLogin.jsp").forward(request,response);
        }else {
            request.setAttribute("msg","登录成功！");
            request.getRequestDispatcher("/teacherFile.index.htm").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/TeacherLogin.jsp").forward(request,response);
    }
}
