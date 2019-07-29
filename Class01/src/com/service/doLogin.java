package com.service;

import com.entity.User;

import javax.servlet.http.Cookie;
import java.io.IOException;

public class doLogin extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        request.setCharacterEncoding("utf-8");

        User user = new User();
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));

        //记住密码复选框
        if("on".equals(request.getParameter("checkbox")))
        {
            Cookie usernameCookie = new Cookie("username",user.getUsername());
            Cookie passwordCookie = new Cookie("password",user.getPassword());
            usernameCookie.setMaxAge(30*24*60*60);
            passwordCookie.setMaxAge(30*24*60*60);
            response.addCookie(usernameCookie);
            response.addCookie(passwordCookie);
        }
        else
        {
            Cookie[] cookie = request.getCookies();
            for(Cookie tempCookie:cookie)
            {
                tempCookie.setMaxAge(0);
                response.addCookie(tempCookie);
            }
        }

        //简单认证
        if("Admin".equals(user.getUsername())&&"123456".equals(user.getPassword()))
        {
            //验证成功
            request.setAttribute("username",user.getUsername());
            request.setAttribute("password",user.getPassword());
            request.getRequestDispatcher("/login_success.jsp").forward(request,response);
        }
        else
        {
            //验证失败
            request.getRequestDispatcher("/login_failure.jsp").forward(request,response);
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request,response);
    }
}
