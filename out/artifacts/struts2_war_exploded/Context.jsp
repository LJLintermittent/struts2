<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/7/1
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%--获取context里面的数据--%>
<%--<s:property value="#request.req"/>--%>

<s:textfield name="username" value="%{#request.req}"> </s:textfield>
</body>
</html>
