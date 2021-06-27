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
<form action="${pageContext.request.contextPath}/map.action" method="post">
    username:<input type="text" name="map['a'].username"/> <br>
    password:<input type="password" name="map['a'].password"/> <br>
    address:<input type="text" name="map['a'].address"/>

    <br><br>

    username:<input type="text" name="map['b'].username"/> <br>
    password:<input type="password" name="map['b'].password"/> <br>
    address:<input type="text" name="map['b'].address"/> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
