<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/6/30
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags"  prefix="s"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
           <s:debug> </s:debug>
<%--获取字符串值--%>
<%-- <s:property value="username"/>--%>
           <br>
           <br>
<%--获取值栈对象的值--%>
           获取对象的值：
<%-- <s:property value="user.username"/>--%>
<%-- <s:property value="user.password"/>--%>
<%-- <s:property value="user.address"/>--%>
<br>
<%--获取值栈中list集合的数据--%>
<%--第一种方式--%>
获取list的第一种方式：
           <br>
<s:property value="list[0].username" />
<s:property value="list[0].password" />
<s:property value="list[0].address" />
<br>
<s:property value="list[1].username"/>
<s:property value="list[1].password"/>
<s:property value="list[1].address"/>

<br>
<br>
获取list的第二种方式：
           <br>
<s:iterator value="list">
    <s:property value="username"/>
    <s:property value="password"/>
    <s:property value="address"/>
    <br>
</s:iterator>
<br>
<br>
获取list的第三种方式：
<br>
<s:iterator value="list" var="user">
    <s:property value="#user.username"/>
    <s:property value="#user.password"/>
    <s:property value="#user.address"/>
    <br>
</s:iterator>
<br>
<%--使用el表达式+foreach标签获取list集合数据--%>
<c:forEach items="${list}" var="user">
    ${user.username}
    ${user.password}
    ${user.address}
    <br>
</c:forEach>

<br>
<%--获取set方法设置的值--%>
<%--<s:property value="username"/>--%>
<br>
<br>
<%--获取push方法设置的值--%>
<%--<s:property value="[0].top"/>--%>



</body>
</html>
