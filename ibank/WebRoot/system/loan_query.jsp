<%@page import="com.ibank.bean.Loan"%>
<%@page import="com.ibank.bean.PageBean"%>
<%@page import="com.ibank.service.impl.LoanServerImpl"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	LoanServerImpl impl = new LoanServerImpl();
	int pageSize = 10;
	int currentPage = 1;
	currentPage = request.getParameter("currentPage") == null ? 1
			: Integer.valueOf(request.getParameter("currentPage"));
	String hql = "from Loan l where l.status=1";
	//获取一页记录
	PageBean pageBean = impl.getOnePageLoanInfo(hql, pageSize,
			currentPage);
	//计算该页是从第几页记录开始
	int offset = (currentPage - 1) * pageSize + 1;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>贷款查询</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />

</head>
<body>
	<table width="100%" class="top" cellpadding="0" cellspacing="0">
		<tr>
			<td>&nbsp;当前位置:&nbsp; <a href="#">首页</a>&nbsp;>>&nbsp; <a
				href="#">综合业务</a>&nbsp;>>&nbsp; <a href="#">贷款查询</a>
			</td>
		</tr>
	</table>
	<div align="center">
		<br />
		<fieldset
			style='width: 95%; height: 80%; padding-bottom: 40px; margin-bottom: 40px'>
			<legend>未还款信息浏览 </legend>
			<br />

<table>
<%
	if (pageBean != null) {
%>


			
			<tr class='line' style='height: 20px'>
				<td style='width: 50px'>序号</td><td style='width: 50px'>贷款id</td><td
					style='width: 100px'>姓名</td><td style='width: 150px'>身份证</td><td
					style='width: 230px'>贷款开始时间</td><td style='width: 80px'>贷款金额</td><td
					style='width: 80px'>申请贷款天数</td><td style='width: 50px'>状态</td><td
					style='width: 100px'>现在贷款</td>
			</tr>
			<%
				List<?> list = pageBean.getList();
					int i = offset;
					for (Object o : list) {
						Loan a = (Loan) o;
			%>

			<tr class='line'
				style='border: 1px solid gray; border-bottom: 0px solid red; height: 30px; line-height: 30px; margin: 0px; width: 1000px'>
				<td style='width: 50px'><%=i%></td> <td style='width: 50px'><%=a.getId()%></td>
				<td style='width: 100px'><%=a.getName()%></td> <td
					style='width: 150px'><%=a.getIdentitycard()%></td> <td
					style='width: 200px'><%=a.getBegintime()%></td> <td
					style='width: 100px'><%=a.getLoanmoney()%></td> <td
					style='width: 70px'><%=a.getLoandays()%>天</td>
				<%
					if (a.getStatus() == 1) {
				%>
				<td style='width: 50px'>未还款</td>
				<%
					} else if (a.getStatus() == 2) {
				%>
				<td style='width: 50px'>已还款</td>
				<%
					}
				%>
				<td style='width: 100px'><a
					href="loaninfo?loan.identitycard=<%=a.getIdentitycard()%>">现在还款</a>
				</td>
			</tr>

			<%
				i++;
					}
			%>
</table>
			<div class='line'
				style='border-top: 1px solid gray; margin: 0px; padding-top: 10px; width: 1000px'>
				<span style='float: left'> <span>第<%=pageBean.getCurrentPage()%>页/共<%=pageBean.getTotalPage()%>页
						<< </span> <%
 	if (pageBean.isHasPreviousPage()) {
 %> <a href="loan_query.jsp?currentPage=1">首页</a> <a
					href="loan_query.jsp?currentPage=<%=currentPage - 1%>">上一页</a> <%
 	}
 %> <a style="color: black">[<%=currentPage%>]</a> <%
 	if (pageBean.isHasNextPage()) {
 %> <a href="loan_query.jsp?currentPage=<%=currentPage + 1%>">下一页</a> <a
					href="loan_query.jsp?currentPage=<%=pageBean.getTotalPage()%>">尾页</a>
					<%
						}
					%> <span> >> 每页<%=pageBean.getPageSize()%>条记录/共<%=pageBean.getAllRow()%>条记录</span>
				</span>
			</div>
			<%
				} else {
			%>
			<label> 没有相关信息 </label> <br />
			<%
				}
			%>

		</fieldset>

	</div>
</body>
</html>