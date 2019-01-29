<%--
  Created by IntelliJ IDEA.
  User: Vitaliy
  Date: 29.01.2019
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Login</title>
</head>
<body>
<div>
  <form action="authorization" method="post">
    Login: <input type="text" name="login" required="required"><br>
    Password: <input type="password" name="password" required="required">
    <input type="submit" value="Sign in">
  </form>
</div>
</body>
</html>
