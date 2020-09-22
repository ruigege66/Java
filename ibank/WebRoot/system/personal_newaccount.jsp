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
<title>新用户注册</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<style type="text/css">
.line {margin:5px; }
</style>
<script type="text/javascript"><!--
function putvaluesex(value){
	document.getElementById("sex1").value=document.getElementById(value).value;
}
function sendtype(value){
	document.getElementById("accountstype").value=document.getElementById(value).value;
}
//添加开户行唯一性选择
function sendtype1(value){
	document.getElementById("ibankid").value=document.getElementById(value).value;
}
function check(){
	var flag=window.confirm('是否确认开户？');
	if(!flag){
		return false;
	}
	if(document.getElementById("accid").value==""){alert("请输入账户号");return false;}
	
	//加入账号长度校验
//	alert("document.getElementById("accid").length");
	//if(document.getElementById("accid").length<16){alert("请输入16位有效卡号!");return false;}
	if(document.getElementById("accname").value==""){alert("请输入姓名");return false;}
	if(document.getElementById("accpassword").value==""){alert("请输入密码");return false;}
	if(document.getElementById("accpwd").value==""){alert("请输入确认密码");return false;}
	if(document.getElementById("accpassword").value!=document.getElementById("accpwd").value){alert("两次输入的密码不一样，请重新输入");document.getElementById("accpassword").value="";document.getElementById("accpwd").value="";return false;}
	if(document.getElementById("sex1").value==""){alert("请选择性别");return false;}
	if(document.getElementById("accidentitycard").value==""){alert("请输入身份证");return false;}
	if(document.getElementById("accountstype").value==""){alert("请选择账户类型");return false;}	
	if(document.getElementById("ibankid").value==""){alert("请输入开户行编号");return false;}
}
--></script>
</head>
<body>
<table width="100%" class="top" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			&nbsp;当前位置:&nbsp;
			<a href="#">首页</a>&nbsp;>>&nbsp;
			<a href="#">个人业务</a>&nbsp;>>&nbsp;
			<a href="#">办理开户</a>
		</td>
	</tr>
</table>
<form action="registaccount" onsubmit="return check()" method="POST">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写账户信息</legend>
		<br/>
		<div class='line'>
			<div align="left" class='leftDiv'>请填写用户账号：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.id" class="text" id="accid" maxlength="19"/><s:label>账号必须由16位数字组成</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请填写用户的姓名：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.name" class="text" id="accname"/><s:label>姓名需身份证号上的名字相同</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请填写用户的密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" name="account.password" id="accpassword" class="text" /><s:label>密码必须是6位数字组成</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请再次输入密码：</div>
			<div align="left" class='rightDiv'>
				<input type="password" id="accpwd" class="text" /><s:label>确保密码没有填错</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请选择性别：</div>
			<div align="left" class='rightDiv'>
				<input type="hidden" name="account.sex" id="sex1" value=""/>
				<input type="radio" name="sex" value="男" id="sexMale" onclick="putvaluesex('sexMale')">
				<label for="sexMale">男</label>
				<input type="radio" name="sex" value="女" id="sexFemale" onclick="putvaluesex('sexFemale')">
				<label for="sexFemale">女</label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入身份证：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.identitycard" id="accidentitycard" class="text"><s:label>实名认证</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入注册金额：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.balance" class="text" value="0"><s:label>注册金额至少为10元整</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入信用卡限额：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="account.overdraft" class="text" value="0"><s:label>没开通信用卡业务的账户此处为0</s:label>
			</div>
		</div>

		<div class='line'>
			<div align="left" class='leftDiv'>请选择账户类型：</div>
			<div align="left" class='rightDiv' style='padding-left:10px'>
			<input type="hidden" name="typeid" id="accountstype" value=""/>
				<select name="type" id="type" onchange="sendtype('type')" style="margin-left:2px">
					<option>---请选择账户类型---</option>
					<option value="1" name="type1">普通卡</option>
					<option value="2" name="type2">信用卡</option>
					<!--<option value="3" name="type3">灵通卡</option>
				--></select>	
				<s:label>必须选择一种账户类型</s:label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入开户行编号：</div>
			<div align="left" class='rightDiv'>
				<!--<input type="text" name="ibankid" class="text" id="ibankid"/><s:label></s:label>
			-->
			<input type="hidden" name="ibankid" id=ibankid value=""/>
				<select name="type" id="type" onchange="sendtype1('type')" style="margin-left:2px">
					<option>---请选择开户行---</option>
					<option value="1" name="type1">银行支行</option>
				</select>	
			</div>
		</div>
		
		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<br/><input type="reset" name="btn" value="重置信息 " class="button"><input type="submit" name="btn" value=" 确认注册 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
