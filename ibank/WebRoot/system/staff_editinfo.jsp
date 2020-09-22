<%@page import="javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import='com.ibank.service.impl.AdminServiceImpl' %>
<%@ page import='com.ibank.bean.Admin' %>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	AdminServiceImpl impl=new AdminServiceImpl();
	String id=request.getParameter("id");
	Admin adm=impl.getAdmin(id);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>员工修改</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<script type="text/javascript">
var flag=0;
function putvaluesex(value){
	document.getElementById("sex1").value=document.getElementById(value).value;
}
function sendtype(value){
	document.getElementById("admintype").value=document.getElementById(value).value;
}
function check(){
	if(document.getElementById("id").value==""){alert("请输入操作员号");return false;}
	if(document.getElementById("name").value==""){alert("请输入姓名");return false;}
	if(document.getElementById("password").value==""){alert("请输入密码");return false;}
	if(document.getElementById("pwd").value==""){alert("请输入确认密码");return false;}
	if(document.getElementById("password").value!=document.getElementById("accpwd").value){alert("两次输入的密码不一样，请重新输入");document.getElementById("accpassword").value="";document.getElementById("accpwd").value="";return false;}
	if(document.getElementById("sex1").value==""){alert("请选择性别");return false;}
	if(document.getElementById("identitycard").value==""){alert("请输入身份证");return false;}
	if(document.getElementById("admintype").value==""){alert("请选择操作员类型");return false;}	
	if(document.getElementById("ibankid").value==""){alert("请输入所属支行编号");return false;}
}
function display(){
	if(flag==0){
		document.getElementById('password').style.display='none';document.getElementById('pwd').style.display='block';
		flag=1;
	}
	else{
		document.getElementById('password').style.display='block';document.getElementById('pwd').style.display='none';
		flag=0;
	}
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
			<a href="#">信息修改</a>
		</td>
	</tr>
</table>
<form action="adminpwdchange" method="POST">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>修改员工信息</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>用户账号：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.id" class="text" id="id" value="<%=adm.getId() %>" readonly/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>账户姓名：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.name" class="text" id="name" value="<%=adm.getName() %>"/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>身份证号码：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.identitycard" class="text"  id="identitycard" value="<%=adm.getIdentitycard() %>"/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>当前密码：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.password" class="text" id="password"  value="<%=adm.getPassword() %>" style="display:block" readonly/>
			</div>
		</div>
		
		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<br/><a href="http://localhost:8080/ibank/system/main_right.jsp"><span>返回首页</span></a>
    <a href="#" onclick="history.go(-1);return false;"><span>返回上一页</span></a><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
