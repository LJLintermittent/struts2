<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/6/29
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/customer_login.action" method="post" target="_parent">
    username:<input type="text" name="username"/> <br>
    password:<input type="password" name="password"/> <br>
<%--    address:<input type="text" name="address"/> <br>--%>
    <input type="submit" value="提交">
</form>
</body>
</html>
