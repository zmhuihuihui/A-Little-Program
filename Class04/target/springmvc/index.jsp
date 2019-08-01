<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zmh
  Date: 2019-07-30
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>demo</title>
</head>
<body>
<h1>注册</h1>
<hr>
<form action="control/register" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td><input type="text" name="username"></td><br>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" name="password"></td><br>
        </tr>
        <tr>
            <td>生日：</td>
            <td><input type="date" name="birthday"></td><br>
        </tr>
        <tr>
            <td></td>
            <td align="right"><input type="submit" value="提交"></td>
        </tr>
    </table>
</form>

</body>
</html>
