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
<title>销户操作</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<script type="text/javascript">

function check(){
	var flag=window.confirm('是否确认销户？');
	if(!flag){
		return false;
	}
	if(document.getElementById("accid").value==""){alert("请输入账户号");return false;}
	if(document.getElementById("name").value==""){alert("请输入用户名");return false;}
	if(document.getElementById("identitycard").value==""){alert("请输入身份证号");return false;}
	if(document.getElementById("name").value==""){alert("请输入姓名");return false;}
}
</script>
</head>
<body>
<table width="100%" class="top" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			&nbsp;当前位置:&nbsp;
			<a href="#">首页</a>&nbsp;>>&nbsp;
			<a href="#">个人业务</a>&nbsp;>>&nbsp;
			<a href="#">账号注销</a>
		</td>
	</tr>
</table>
<form action="logoff" method="POST" onsubmit="return check()">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写注销信息</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>请填写用户账号：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.id" class="text" id="accid"/>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>填写用户姓名：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.name" class="text" id="name"/>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>填写用户身份证：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.identitycard" class="text" id="identitycard"/>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入账户密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="account.password" class="text" id="password"/>
			</div>
		</div>

		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<br/><input type="reset" name="btn" value=" 重置信息 " class="button"><input type="submit" name="btn" value=" 确认注销 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
