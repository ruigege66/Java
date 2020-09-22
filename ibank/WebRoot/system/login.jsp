﻿<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>银行业务管理系统</title>
</head>
<style>
* {
	margin: 0 auto;
	padding: 0;
	border: 0;
}

body {
	background: #0462A5;
	font: 12px "宋体";
	color: #004C7E;
}

input {
	border: 1px solid #004C7E;
}

.main {
	background: url(./images/bg.jpg) repeat-x;
	height: 800px;
}

.login {
	background: #DDF1FE;
	width: 468px;
	height: 262px;
	border: 1px solid #000;
}

.top {
	background: url(images/login_bg.jpg) repeat-x;
	width: 464px;
	height: 113px;
	border: 1px solid #2376B1;
	margin-top: 1px;
}

.logo {
	background: url(images/top_lf.jpg) no-repeat;
	width: 214px;
	height: 42px;
	float: left;
	margin: 29px 0 0 14px;
}

.lable {
	background: url(images/lable.gif) no-repeat;
	width: 157px;
	height: 32px;
	float: right;
	margin: 81px 31px 0 0;
}

.submit {
	background: url(images/submit.gif) no-repeat;
	width: 71px;
	height: 24px;
	border: 0;
	margin-left: 20px;
}

.reset {
	background: url(images/reset.gif) no-repeat;
	width: 71px;
	height: 24px;
	border: 0;
	margin-left: 20px;
}

.length {
	width: 150px;
	height: 20px;
}

td {
	
}

a {
	text-decoration: none;
}

a:hover {
	color: red;
}
</style>
<script type="text/javascript">
function check(){
	if(document.getElementById("id").value==""){alert("请输入账户号");return false;}
	if(document.getElementById("password").value==""){alert("请输入密码");return false;}
}
</script>
<body>
	<s:form action="login" method="post" onsubmit="return check()">
		<table width="100%" class="main" cellpadding="0" cellspacing="0">
			<tr>
				<td>
					<div class="login">
						<div class="top">
							<div class="logo"></div>
							<div class="lable"></div>
						</div>
						<table width="468" cellpadding="0" cellspacing="0">
							<tr>
								<td width="282" style="padding-top: 19px;">
									<table width="100%" cellpadding="0" cellspacing="0">
										<tr>
											<td align="right" height="27">用户名:</td>
											<td align="right" width="161"><input type="text"
												name="admin.id" class="length" id="id" /></td>
										</tr>
										<tr>
											<td align="right" height="27">密码:</td>
											<td align="right" width="161"><input type="password"
												name="admin.password" class="length" id="password" /></td>
										</tr>
									</table></td>
								<td style="padding-top: 20px;">
									<table width="100%" cellpadding="0" cellspacing="0">
										<tr>
											<td align="left" height="29"><input name="submit"
												type="submit" value="" class="submit" /></td>
										</tr>
										<tr>
											<td align="left" height="29"><input name="reset"
												type="reset" value="" class="reset" /></td>
										</tr>
									</table></td>
							</tr>
						</table>
						<table width="100%" cellpadding="0" cellspacing="0"
							style="margin-top: 0px; margin-bottom: 0px;">
							<tr>
								<td align="center" style="color: red"><s:fielderror
										name="error" cssStyle="width:60px"></s:fielderror></td>
							</tr>
							<!--<tr>
								<td align="center">忘记密码?请联系管理员</a>&nbsp;&nbsp;</td>
							</tr>
							--><tr>
								<td align="center">&nbsp;</td>
							</tr>
							<tr>
								<td align="center">Copyright xxxx</td>
							</tr>
						</table>
					</div> <!--login --></td>
			</tr>
		</table>
	</s:form>
</body>
</html>
