<%@page import="com.ibank.bean.Admin"%>
<%@ page isELIgnored="false" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>银行业务系统</title>
</head>
<style>
* {
	margin: 0 auto;
	padding: 0;
	border: 0;
}

body {
	font: 12px "宋体";
	color: #FFF;
}

.lable {
	background: url(images/top_lable.jpg) no-repeat;
	width: 126px;
	height: 28px;
	float: left;
}

.lable p {
	margin-top: 6px;
	font-size: 14px;
}

.menu {
	background: url(images/top_menu.jpg) no-repeat;
	width: 348px;
	height: 28px;
	float: right;
}

.menu ul {
	margin: 2px 0 0 90px;
	list-style: none;
}

.menu li {
	display: inline;
}

.menu a {
	float: left;
	text-decoration: none;
	padding-left: 2px;
}

.menu a:hover {
	text-decoration: none;
}

.menu a span {
	display: block;
	padding-right: 10px;
	color: #FFF;
}

.menu a:hover span {
	color: #004c7e;
}

.menu_left {
	background: url(images/menu_left.jpg) no-repeat;
	width: 155px;
	height: 22px;
	float: left;
	margin: 3px 0 0 4px;
}

.menu_left p {
	margin-top: 4px;
	padding-left: 24px;
}

.menu_left a {
	text-decoration: none
}

.menu_list {
	width: 100%;
	height: 25px;
}

.menu_list ul {
	margin: 0;
	padding: 4px 0 0 55px;
	list-style: none;
}

.menu_list li {
	display: inline;
}

.menu_list a {
	float: left;
	text-decoration: none;
}

.menu_list a span {
	display: block;
	padding: 4px 10px 0 10px;
	color: #004c7e;
}

.menu_list a:hover span {
	color: #FFF;
	border: 1px solid #004c7e;
}

.menu_list a:hover {
	background: url(images/menu_list.jpg) repeat-x;
}
</style>
<script>
function showTime() {
	var Digital = new Date(); 
	var year=Digital.getYear();   
	var month=Digital.getMonth()+1;   
	var day=Digital.getDate();  
	var hours = Digital.getHours();
	var minutes = Digital.getMinutes();
	var seconds = Digital.getSeconds();
	if (hours == 0) {
		hours = 12;
	}
	if (hours <= 9) {
		hours = "0" + hours;
	}
	if (minutes <= 9) {
		minutes = "0" + minutes;
	}
	if (seconds <= 9) {
		seconds = "0" + seconds;
	}
	var ctime = hours + ":" + minutes + ":" + seconds;
	document.getElementById("nowtime").innerHTML = "&nbsp;今天"+year+"年"+month+"月"+day+"日 当前时间: <b style='color:white;'>"
			+ ctime + "</b>";
	setTimeout("showTime()", 1000);
}

</script>
<body  onload="showTime()">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td background="images/top_bg.jpg" width="289" height="57">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><img src="images/top_lf.jpg" /></td>
					</tr>
				</table></td>
			<td background="images/top_bg.jpg">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="29"><span name="当前时间" id="nowtime"></span></td>
					</tr>
					<tr>
						<td width="50%" height="28">
							 </td>
						<td>
							<div class="menu">
								<ul>
									<li><a href="http://localhost:8080/ibank/system/index.jsp"
										target="_parent"><span>首页</span> </a></li>
									<li><a href="http://localhost:8080/ibank/system/index.jsp"
										target="_parent"
										onclick="javascript:history.go(-1); return false"><span>后退</span>
									</a></li>
									<li><a href="http://localhost:8080/ibank/system/index.jsp"
										target="_parent" onclick="window.location.reload()"><span>刷新</span>
									</a></li>
									<li><a href="http://localhost:8080/ibank/system/index.jsp"
										target="_parent"><span>链接</span> </a></li>
									<li><a href="logout" target="_parent"><span>退出/span>
									</a></li>
								</ul>
							</div></td>
						<td width="18"></td>
					</tr>
				</table></td>
		</tr>
	</table>
	<table width="100%" height="25" border="0" cellspacing="0"
		cellpadding="0">
		<tr>
			<td background="images/menu_bg.jpg" width="165">
				<div class="menu_left">
					<s:if test="#session.admin==null"><jsp:forward
							page="login.jsp" />
					</s:if>
					<p>
						操作叿 <a href="#" onclick="sendurl('admin_info.jsp')"><s:property
								value="#session.admin.name" default="null" /> </a>
					</p>
				</div></td>
			<td background="images/menu_bg.jpg">
				<div class="menu_list">
					<ul>
						<li><a href="#" onclick="sendurl('personal_newaccount.jsp')"><span>新建账户</span>
						</a></li>
						<li><a href="#" onclick="sendurl('personal_inputmoney.jsp')"><span>办理存款</span>
						</a></li>
						<li><a href="#" onclick="sendurl('personal_outputmoney.jsp')"><span>办理取款</span>
						</a></li>
						<li><a href="#"
							onclick="sendurl('personal_changepassword.jsp')"><span>修改密码</span>
						</a></li>
						<script type="text/javascript">
							function sendurl(value) {
								//alert(self.parent.frames["center"].loaction);
								self.parent.frames["center"].frames["I2"].location = value;
							}
						</script>
					</ul>
				</div></td>
		</tr>
	</table>
</body>
</html>
