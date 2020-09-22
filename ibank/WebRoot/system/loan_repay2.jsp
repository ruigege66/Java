<%@page import="java.math.BigDecimal"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.logging.SimpleFormatter"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="com.ibank.bean.Loan"%>
<%@page import="com.ibank.bean.Loan"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx" %>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			
	Loan  loaninfo =(Loan)request.getAttribute("loanInfo");
	//计算贷款的天数
	long days=new Date().getTime() / 86400000 - loaninfo.getBegintime().getTime() / 86400000;
	
	//计算最终需要还款的金额
	double interest=loaninfo.getInterest().getValue();
	double repaymoney=(interest / 365) * days * loaninfo.getLoanmoney()+loaninfo.getLoanmoney();
	BigDecimal bd = new BigDecimal(repaymoney);
	BigDecimal bd2 = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
	
	//设置日期格式转换器
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   
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
</head>
<body>
<table width="100%" class="top" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			&nbsp;当前位置:&nbsp;
			<a href="#">首页</a>&nbsp;>>&nbsp;
			<a href="#">个人业务</a>&nbsp;>>&nbsp;
			<a href="#">贷款还款</a>
		</td>
	</tr>
</table>
<form action="repayLoan" onsubmit="return window.confirm('是否确认还款？')" method="POST">
<div align="center">
	<br/>
	<fieldset style='width:95%;height:80%;margin-top:10px'>
		<legend>填写还贷款信息</legend>
		<br/>

		<div class='line'>
			<div align="left" class='leftDiv'>您的姓名：</div>
			<div align="left" class='rightDiv'>
				<s:label><%=loaninfo.getName() %></s:label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>您的身份证：</div>
			<div align="left" class='rightDiv'>
				<input type="hidden" name="loan.identitycard" id="identitycard" class="text" value="<%=loaninfo.getIdentitycard() %>"><s:label><%=loaninfo.getIdentitycard() %></s:label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>您的贷款金额：</div>
			<div align="left" class='rightDiv'>
				<s:label><%=loaninfo.getLoanmoney() %>元</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>您的贷款日期：</div>
			<div align="left" class='rightDiv'>
				<s:label><%=sdf.format(loaninfo.getBegintime()) %></s:label>
			</div>
		</div>
		
		<div class='line'>
			<div align="left" class='leftDiv'>您实际贷款的天数为：</div>
			<div align="left" class='rightDiv'>
				<input type="hidden" name="loan.loandays" id="identitycard" class="text" value="<%=days %>"><s:label><%=days %>天</s:label>
			</div>
		</div>
		<div class='line'>
			<div align="left" class='leftDiv'>您需要还款的金额为:</div>
			<div align="left" class='rightDiv'>
				<input type="hidden" name="loan.refundmoney" id="identitycard" class="text" value="<%=bd2 %>"><s:label><%=bd2 %>元</s:label>
			</div>
		</div>
		
		<div class='line' style='height:40px;'>
			<div align="left" class='leftDiv'></div>
			<div align="left" class='rightDiv'>

				<br/><input type="reset" name="btn" value="重置信息 " class="button"><input type="submit" name="btn" value=" 确定还贷 " class="button"><br/>
			</div>
		</div>
	</fieldset>
</div>
</form>
</body>
</html>
