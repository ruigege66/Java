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
<title>取款操作</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<script type="text/javascript">

function check(){
	var flag=window.confirm('是否确认取款？');
	if(!flag){
		return false;
	}
	if(document.getElementById("balance").value==""){alert("请输入取款金额");return false;}
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
			<a href="#">个人取款</a>
		</td>
	</tr>
</table>
<form action="outputmoney" method="POST" onsubmit="return check()">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写取款金额</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>您输入的账号是：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#request.account.id" />
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>该账户姓名是：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#request.account.name" />
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>该账户余额为：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#request.account.balance" />
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入要取款的金额：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="outputmoney" id="balance"  class="text"/>
				<input type="hidden" name="account.id" value="${request.account.id}"/>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入取款密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="account.password" id="password"  class="text"/>
			
			</div>
		</div>
		
		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<br/><input type="reset" name="btn" value=" 重置信息 " class="button"><input type="submit" name="btn" value=" 我要取款 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
