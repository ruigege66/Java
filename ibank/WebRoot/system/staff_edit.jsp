<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>员工密码修改</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<script type="text/javascript">
function check(){
	var flag=window.confirm('是否确认修改密码？');
	if(!flag){
		return false;
	}
	if(document.getElementById("id").value==""){alert("请输入操作员号");return false;};
	if(document.getElementById("password").value==""){alert("请输入密码");return false;}
	if(document.getElementById("newpassword").value==""){alert("请输入密码");return false;}
	if(document.getElementById("pwd").value==""){alert("请输入确认密码");return false;}
	if(document.getElementById("newpassword").value!=document.getElementById("pwd").value){alert("两次输入的密码不一样，请重新输入");return false;}
}
</script>
</head>
<body>
<table width="100%" class="top" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			&nbsp;当前位置:&nbsp;
			<a href="#">首页</a>&nbsp;>>&nbsp;
			<a href="#">员工管理</a>&nbsp;>>&nbsp;
			<a href="#">密码修改</a>
		</td>
	</tr>
</table>
<form action="adminpwdchange" method="POST" onsubmit="return check()">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>修改员工信息</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>请填写员工账号：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.id" class="text" id="id"/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入员工密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="admin.password" class="text" id="password"/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入新密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="newpassword" class="text" id="newpassword"/>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>再次输入新密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="pwd" class="text" id="pwd"/>
			</div>
		</div>
		
		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<br/><input type="reset" name="btn" value=" 重置信息  " class="button"><input type="submit" name="btn" value="修改密码 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
