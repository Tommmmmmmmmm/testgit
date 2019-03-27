<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登录</h1>
<form action="login.action" method="post">
	学/工号:<br/>
	<input name="username"/><br/>  
	密码:<br/>
	<input type="password" name="password"/><br/>
	<input type="radio" name="ident" value="student">学生
	<input type="radio" name="ident" value="teacher">老师<br/>
	<input type="submit" value="登录"/>
	<a href="register.jsp">还没有账号?立即注册</a>
	<a href="admin_login.jsp">管理员登录</a>
</form>
</body>
</html>