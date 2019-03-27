<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login/tchRegist.action">
<table>
	<tr>
		<td>工号:</td>
		<td><input id="tno" name="tno"></td>
	</tr>
	<tr>
		<td>姓名:</td>
		<td><input id="tno" name="tname"></td>
		
	</tr>
	<tr>
		<td>性别:</td>
		<td><select name="tgender">
				<option value="0">男</option>
				<option value="1">女</option>
			</select>
		</td>
	</tr>
	
	<tr>
		<td>密码:</td>
		<td><input id="tno" type="password" name="tpassword"></td>
	</tr>
	<tr>
		<td></td>
		<td><input id="tchRegister" type="submit" value="注册"></td>
	</tr>
</table>
</form>
</body>
</html>