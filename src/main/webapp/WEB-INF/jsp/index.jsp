<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
    <h3> 欢迎 ${uname}当前时间：</h3>
    <form action="login" method="post">
    <input name="uname" placeholder="名字"/><br/>
    <input name="passwd" placeholder="密码"/><br/>
        <input type="submit" value="登录">
    </form>
</body>
</html>