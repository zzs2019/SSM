<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Z Z S
  Date: 2019/8/4
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>查询所有账户</h1>
    <c:forEach items="${list}" var="account">
        ${account.id}
        ${account.name}
        ${account.money}
        <br>
    </c:forEach>
</body>
</html>
