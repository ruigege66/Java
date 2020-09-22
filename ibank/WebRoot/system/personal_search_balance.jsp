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
<title>余额查询</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<script type="text/javascript">

function check(){
	var flag=window.confirm('是否查询余额？');
	if(!flag){
		return false;
	}
	if(document.getElementById("accid").value==""){alert("请输入账户号");return false;}
	if(document.getElementById("password").value==""){alert("请输入密码");return false;}
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
			<a href="#">余额查询</a>
		</td>
	</tr>
</table>
<form action="searchbalance" method="POST" onsubmit="return check()">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写余额查询信息</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>请填写用户账号：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.id" class="text" id="accid"/>
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
				<br/><input type="reset" name="btn" value=" 重置信息 " class="button"><input type="submit" name="btn" value=" 提交信息 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
