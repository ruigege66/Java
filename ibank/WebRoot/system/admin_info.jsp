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
<title>操作员信息查看</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />

</head>
<body>
<table width="100%" class="top" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			&nbsp;当前位置:&nbsp;
			<a href="#">首页</a>&nbsp;>>&nbsp;
			<a href="#">员工管理</a>&nbsp;>>&nbsp;
			<a href="#">操作员信息</a>
		</td>
	</tr>
</table>

<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>操作员信息</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>操作员工号：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#session.admin.id"/>
				</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>操作员姓名：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#session.admin.name"/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>操作员性别：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#session.admin.sex"/>
				</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>注册身份证：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#session.admin.identitycard"/>
				</div>
		</div>

		<div class='line'>
			<div align="left" class='leftDiv'>&nbsp;注册时间：</div>
			<div align="left" class='rightDiv'>
				<s:property value="#session.admin.regtime"/>
				</div>
		</div>

		<div class='line'>
			<div align="left" class='leftDiv'>操作员类别：</div>
			<div align="left" class='rightDiv'>
			<s:if test="#session.admin.type==1"><s:label>普通操作员</s:label></s:if>
			<s:if test="#session.admin.type==2"><s:label>高级操作员</s:label></s:if>
			<s:if test="#session.admin.type==3"><s:label>超级操作员</s:label></s:if>
				</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>操作员状态：</div>
			<div align="left" class='rightDiv'>
			<s:if test="#session.admin.status==0"><s:label>已注销</s:label></s:if>
			<s:if test="#session.admin.status==2"><s:label>异常</s:label></s:if>
			<s:if test="#session.admin.status==1"><s:label>正常</s:label></s:if>
				</div>
		</div>

		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<a href="http://localhost:8080/ibank/system/main_right.jsp"><span>返回首页</span></a>
    			<a href="#" onclick="history.go(-1);return false;"><span>返回上一页</span></a>
			</div>
		</div>
	</fieldset>
</div>

</body>
</html>
