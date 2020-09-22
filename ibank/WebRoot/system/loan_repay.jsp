<%@page import="java.util.Date"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx" %>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<sx:head/>

<head>
<title>贷款还款</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<style type="text/css">
.line {margin:5px; }
</style>
<script type="text/javascript">

function check(){
	var flag=window.confirm('是否确认查询贷款信息？');
	if(!flag){
		return false;
	}
	if(document.getElementById("identitycard").value==""){alert("请输入身份证");return false;}
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
			<a href="#">办理还款</a>
		</td>
	</tr>
</table>
<form action="loaninfo" onsubmit="return check()" method="POST">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写还贷款信息</legend>
		<br/>

		<div class='line'>
			<div align="left" class='leftDiv'>请输入身份证：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="loan.identitycard" id="identitycard" class="text"><s:label>请输入正确的身份证号</s:label>
			</div>
		</div>
		
		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<br/><input type="reset" name="btn" value="重置信息 " class="button"><input type="submit" name="btn" value=" 查看贷款信息 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
