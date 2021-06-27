<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 20127
  Date: 2020/7/1
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form>
    <s:textfield name="username" label="用户名"> </s:textfield>
    <s:password name="password" label="密码"> </s:password>
    <s:radio list="{'男','女'}" name="sex" label="性别"> </s:radio>
    <s:checkboxlist list="{'java','python','c++'}" name="hobby" label="爱好"> </s:checkboxlist>
    <s:select list="{'2000','1999','1998'}" name="year" label="出生年份"> </s:select>
    <s:file name="file" label="上传文件"> </s:file>
    <s:textarea rows="10" cols = "10" name="resum" label="简介"> </s:textarea>
    <s:submit value="提交"> </s:submit>
    <s:reset value="重置"> </s:reset>
</s:form>
</body>
</html>
