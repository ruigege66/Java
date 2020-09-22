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
<title>贷款办理</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<style type="text/css">
.line {margin:5px; }
</style>
<script type="text/javascript">

function check(){
	var flag=window.confirm('是否确认办理贷款？');
	if(!flag){
		return false;
	}
	if(document.getElementById("name").value==""){alert("请输入姓名");return false;}
	if(document.getElementById("identitycard").value==""){alert("请输入身份证");return false;}
	if(document.getElementById("loanmoney").value==""){alert("请输入贷款金额");return false;}	
	if(document.getElementById("begintime").value==""){alert("请输入贷款开始时间");return false;}
	if(document.getElementById("loandays").value==""){alert("请输入贷款天数");return false;}
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
			<a href="#">贷款办理</a>
		</td>
	</tr>
</table>
<form action="loan" onsubmit="return check()" method="POST">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写贷款信息</legend>
		<br/>

		<div class='line'>
			<div align="left" class='leftDiv'>请填写用户的姓名：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="loan.name" class="text" id="name"/><s:label>请正确填写姓名，确保贷款有效性</s:label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入身份证：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="loan.identitycard" id="identitycard" class="text"><s:label>实名认证，同一用户不能多次贷款</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入贷款金额：</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="loan.loanmoney" id="loanmoney" class="text" value='1000.00'><s:label>最低贷款金额为1000元</s:label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>请输入开始时间</div>
			<div align="left" class='rightDiv' style="padding-left:7px">
				<sx:datetimepicker cssStyle='border:1px solid red;width:160px' id='begintime' name='loan.begintime' onclick="alert('a')" value=""></sx:datetimepicker><s:label>单击日历控件选择正确的日期</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>请输入贷款天数</div>
			<div align="left" class='rightDiv'>
				<input type="text" name="loan.loandays" id='loandays' class="text" value="30"><s:label>贷款天数最低为30天</s:label>
			</div>
		</div>
		
		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>
				<br/><input type="reset" name="btn" value="重置信息 " class="button"><input type="submit" name="btn" value=" 马上贷款 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
