<%--
  Created by IntelliJ IDEA.
  User: Z Z S
  Date: 2019/8/2
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>hello  SSM整合</h1>
    <a href="account/test">事务拦截测试</a>
    <br>
    <br>
    <a href="account/findAll">查询所有账户</a>
    <br>
    <br>
    <h3>按ID查询</h3>
    <form action="account/findById" method="post">
        请输入ID<input type="text" name="id"><br>
        <input type="submit" value="提交">
    </form>
    <br>
    <br>
    <h3>保存账户</h3>
    <form action="account/saveAccount" method="post">
        姓名<input type="text" name="name"><br>
        金额<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>

    <br>
    <br>
    <h3>更新账户</h3>
    <form action="account/updateAccount" method="post">
        ID<input type="text" name="id"><br>
        姓名<input type="text" name="name"><br>
        金额<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>
    <br>
    <br>
    <h3>删除账户</h3>
    <form action="account/deleteAccount" method="post">
        请输入ID<input type="text" name="id"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
