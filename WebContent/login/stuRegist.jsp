<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text.css" href="/css/themes/gray/easyui.css">
<link rel="stylesheet" type="text.css" href="/css/themes/icon.css">
<script src="/js/jquery.min.js"></script>
<script src="/js/jquery.easyui.min.js"></script>
<script src="/js/easyui-lang-zh_CN.js"></script> 
<script>
$(function(){
	$(".ipt").textbox({
		width:"150px"
	});
	
});
</script>
</head>
<body>
<form action="${pageContext.request.contextPath}/login/stuRegist.action">
<table>
	<tr>
		<td>学号:</td>
		<td><input id="sno" name="sno" class="ipt"></td>
	</tr>
	<tr>
		<td>姓名:</td>
		<td><input id="sname" name="sname" class="ipt"></td>
	</tr>
	<tr>
		<td>性别:</td>
		<td><select name="sgender">
				<option value="0">男</option>
				<option value="1">女</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>班级:</td>
		<td><input id="sclass" name="sclass"></td>
	</tr>
	<tr>
		<td>密码:</td>
		<td><input id="spassword" type="password" name="spassword"></td>
	</tr>
	<tr>
		<td>专业:</td>
		<td><input id="smajor" name="smajor"></td>
		<td><select name="smajor">
				<option></option>
			</select>
		</td>
	</tr>
	
	<tr>
		<td></td>
		<td><input id="stuRegister" type="submit" value="注册"></td>
	</tr>
</table>
</form>
</body>
</html>