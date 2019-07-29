<%--
  Created by IntelliJ IDEA.
  User: zmh
  Date: 2019-07-28
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  String username="";
  String password="";

  Cookie[] cookie = request.getCookies();
  if(cookie!=null&&cookie.length>0)
  {
    for (Cookie tempCookie : cookie)
    {
      if (tempCookie.getName().equals("username"))
        username = tempCookie.getValue();
      if (tempCookie.getName().equals("password"))
        password = tempCookie.getValue();
    }
  }
%>

<html>
  <head>
    <title>Class01</title>
  </head>
  <body>
  <h1>Welcome Class01!</h1>
  <hr>
  <form name="doLogin" action="com.service.doLogin" method="post">
    <table>
      <tr>
        <td align="center">用户名:</td>
        <td><input type="text" name="username" value=<%=username %>></td>
      </tr>
      <tr>
        <td align="center">密码:</td>
        <td><input type="password" name="password" value=<%=password %>></td>
      </tr>
      <tr>
        <td align="center"><input type="checkbox" name="checkbox"/>记住密码</td>
        <td align="right"><input type="submit" value="登录"/></td>
      </tr>
    </table>
  </form>
  </body>
</html>
