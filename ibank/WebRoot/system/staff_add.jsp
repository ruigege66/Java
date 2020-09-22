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
<title>员工添加</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<script type="text/javascript">
function putvaluesex(value){
	document.getElementById("sex1").value=document.getElementById(value).value;
}
function sendtype(value){
	document.getElementById("admintype").value=document.getElementById(value).value;
}

//添加开户行唯一性选择
function sendtype1(value){
	document.getElementById("ibankid").value=document.getElementById(value).value;
}
function check(){
	var flag=window.confirm('是否添加新操作员？');
	if(!flag){
		return false;
	}
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
</script>
</head>
<body>
<table width="100%" class="top" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			&nbsp;当前位置:&nbsp;
			<a href="#">首页</a>&nbsp;>>&nbsp;
			<a href="#">员工管理</a>&nbsp;>>&nbsp;
			<a href="#">员工添加</a>
		</td>
	</tr>
</table>
<form action="registadmin" method="POST" onsubmit="return check()">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写员工信息</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>请填写操作员账号：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.id" class="text" id="id"/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入操作员姓名：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.name" class="text" id="name"/>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入操作员密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="admin.password" class="text" id="password"/>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>再次输入操作员密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="pwd" class="text"  id="pwd"/>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入身份证号码：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="admin.identitycard" class="text"  id="identitycard"/>
			</div>
		</div>

		
		<div class='line'>
			<div align="left" class='leftDiv'>请选择性别：</div>
			<div align="left" class='rightDiv'>
				<input type="hidden" name="admin.sex" id="sex1" value="男"/>
				<input type="radio" name="sex" value="男" id="sexMale" onclick="putvaluesex('sexMale')">
				<label for="sexMale">男</label>
				<input type="radio" name="sex" value="女" id="sexFemale" onclick="putvaluesex('sexFemale')">
				<label for="sexFemale">女</label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请选择操作员类型：</div>
			<div align="left" class='rightDiv' style='padding-left:10px'>
			<input type="hidden" name="admin.type" id="admintype" value=""/>
				<select name="type" id="type" onchange="sendtype('type')" style="margin-left:2px">
					<option>---请选择操作员类型---</option>
					<option value="1" name="type1">普通操作员</option>
					<option value="2" name="type2">高级操作员</option>
					<option value="3" name="type3">超级操作员</option>
				</select>	
				<s:label>必须选择一种账户类型</s:label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入开户行编号：</div>
			<div align="left" class='rightDiv'>
				<!--<input type="text" name="ibankid" class="text" id="ibankid"/>-->
				<input type="hidden" name="ibankid" id=ibankid value=""/>
				<select name="type" id="type" onchange="sendtype1('type')" style="margin-left:2px">
					<option>---请选择开户行---</option>
					<option value="1" name="type1">银行支行</option>
				</select>	
				
				
				<s:label></s:label>
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
