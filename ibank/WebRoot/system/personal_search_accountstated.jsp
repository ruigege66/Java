<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.ibank.service.impl.AccHistoryServiecImpl"%>
<%@page import="com.ibank.bean.Acchistory"%>
<%@ page import="com.ibank.bean.PageBean"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	//创建Acchistoryserviece对象
	AccHistoryServiecImpl impl = new AccHistoryServiecImpl();
	//定义每页显示的记录数
	int pageSize = 10;
	//定义当前第几页得默认值为1
	int currentPage = 1;
	//获取账户id
	String id = request.getParameter("id");
	//获取当前第几页，获取失败则为默认值1
	currentPage = request.getParameter("currentPage") == null ? 1
			: Integer.valueOf(request.getParameter("currentPage"));
	PageBean pageBean = null;
	//定义从第几条记录开始，默认值为1
	int offset = 1;
	if (id != null) {
		String hql = "from Acchistory a where a.account.id=" + id
				+ " order by a.time";
		//查询一页记录
		pageBean = impl.getOnePage(hql, pageSize, currentPage);
		//获得当前是从第几条记录开始
		offset = (currentPage - 1) * pageSize + 1;
	}
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>明细查询</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />

</head>
<body>
	<table width="100%" class="top" cellpadding="0" cellspacing="0">
		<tr>
			<td>&nbsp;当前位置:&nbsp; <a href="#">首页</a>&nbsp;>>&nbsp; <a
				href="#">个人业务</a>&nbsp;>>&nbsp; <a href="#">明细查询</a></td>
		</tr>
	</table>
	<form action="personal_search_accountstated.jsp" method="POST">
		<div align="center">
			<br />
			<fieldset style='width: 95%;'>
				<legend> 请输入查询条件 </legend>
				<br />
				<div class='line'>
					<div align="left" class='leftDiv'>请填写用户账号：</div>
					<div align="left" class='rightDiv'>
						<input type="text" name="id" class="text" /> <input type="reset"
							name="btn" value=" 重置信息 " class="button"> <input
							type="submit" name="btn" value=" 提交信息 " class="button">
					</div>
				</div>


			</fieldset>
		</div>
	</form>
	<div align="center">
		<br />
		<fieldset
			style='width: 95%; height: 80%; padding-bottom: 40px; margin-bottom: 40px'>
			<legend> 以下是查询结果 </legend>
			<br />
<table>
			<%
				if (pageBean != null) {
			%>
			<tr class='line' style='height: 20px'>
				<td style='width: 40px'>编号</td><td style='width: 200px'>账号</td><td
					style='width: 120px'>姓名</td><td style='width: 120px'>操作</td><td
					style='width: 120px'>金额</td><td style='width: 120px'>时间</td><td
					style='width: 220px'> </td>
			</tr>
			<%
				int i = offset;
					List<?> list = pageBean.getList();
					for (Object o : list) {
						Acchistory a = (Acchistory) o;
			%>

			<tr class='line'
				style='border: 1px solid gray; border-bottom: 0px solid red; height: 30px; line-height: 30px; margin: 0px; width: 1000px'>
				<%
					if (a.getAction() == 1) {
				%>
				<td style='width: 40px'><%=i%></td><td style='width: 200px'><%=a.getAccount().getId()%></td><td
					style='width: 120px'><%=a.getAccount().getName()%></td><td
					style='width: 120px'>存款</td><td style='width: 120px'><%=a.getMoney()%></td><td
					style='width: 120px'><%=a.getTime()%></td><td
					style='width: 220px'> </td>
				<%
					}
							if (a.getAction() == 2) {
				%>
				<td style='width: 40px'><%=i%></td><td style='width: 200px'><%=a.getAccount().getId()%></td><td
					style='width: 120px'><%=a.getAccount().getName()%></td><td
					style='width: 120px'>取款</td><td style='width: 120px'><%=-a.getMoney()%></td><td
					style='width: 120px'><%=a.getTime()%></td><td
					style='width: 220px'> </td>
				<%
					}
							if (a.getAction() == 3) {
				%>
				<td style='width: 40px'><%=i%></td><td style='width: 200px'><%=a.getAccount().getId()%></td><td
					style='width: 120px'><%=a.getAccount().getName()%></td><td
					style='width: 120px'>利息</td><td style='width: 120px'><%=a.getMoney()%></td><td
					style='width: 120px'><%=a.getTime()%></td><td
					style='width: 220px'> </td>
				<%
					}
				%>
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
 %> <a href="personal_search_accountstated.jsp?id=<%=id%>&currentPage=1">首页</a>
					<a
					href="personal_search_accountstated.jsp?id=<%=id%>&currentPage=<%=currentPage - 1%>">上一页</a>
					<%
						}
					%> <a style="color: black">[<%=currentPage%>]</a> <%
 	if (pageBean.isHasNextPage()) {
 %> <a
					href="personal_search_accountstated.jsp?id=<%=id%>&currentPage=<%=currentPage + 1%>">下一页</a>
					<a
					href="personal_search_accountstated.jsp?id=<%=id%>&currentPage=<%=pageBean.getTotalPage()%>">尾页</a>
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
