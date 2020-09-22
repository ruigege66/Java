<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.ibank.bean.PageBean"%>
<%@ page import="com.ibank.bean.Admin"%>
<%@ page import="com.ibank.service.impl.AdminServiceImpl"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	int pageSize = 20;
	int currentPage = 1;
	currentPage = request.getParameter("currentPage") == null ? 1
			: Integer.valueOf(request.getParameter("currentPage"));
	String hql = "from Admin a order by a.regtime";
	AdminServiceImpl impl = new AdminServiceImpl();
	PageBean pageBean = impl.getOnePage(hql, pageSize, currentPage);
	int offset = (currentPage - 1) * pageSize + 1;
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

	<div align="center">
		<br />
		<fieldset
			style='width: 95%; height: 80%; padding-bottom: 40px; margin-bottom: 40px'>
			<legend> 操作员信息浏览 </legend>
			<br />
<table>
			<%
				if (pageBean != null) {
			%>
			<tr class='line' style='height: 20px'>
				<td style='width: 50px'>序号</td><td style='width: 120px'>登录ID</td><td
					style='width: 100px'>姓名</td><td style='width: 50px'>性别</td><td
					style='width: 220px'>身份证</td><td style='width: 200px'>所属支行</td><td
					style='width: 50px'>权限</td><td style='width: 140px'>注册时间</td><td
					style='width: 150px'>操作</td>
			</tr>
			<%
				List<?> list = pageBean.getList();
					int i = offset;
					for (Object o : list) {
						Admin a = (Admin) o;
			%>

			<tr class='line'
				style='border: 1px solid gray; border-bottom: 0px solid red; height: 30px; line-height: 30px; margin: 0px; width: 1000px'>
				<td style='width: 50px'><%=i%></td><td style='width: 120px'><%=a.getId()%></td><td
					style='width: 100px'><%=a.getName()%></td><td
					style='width: 50px'><%=a.getSex()%></td><td
					style='width: 220px'><%=a.getIdentitycard()%></td><td
					style='width: 100px'><%=a.getIbank().getName()%></td><td
					style='width: 50px'><%=a.getType()%></td><td
					style='width: 140px'><%=a.getRegtime()%></td><td><a
					href="staff_editinfo.jsp?id=<%=a.getId()%>" style='width: 150px'>密码查看</a></td>
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
 %> <a href="staff_list.jsp?currentPage=1">首页</a> <a
					href="staff_list.jsp?currentPage=<%=currentPage - 1%>">上一页</a> <%
 	}
 %> <a style="color: black">[<%=currentPage%>]</a> <%
 	if (pageBean.isHasNextPage()) {
 %> <a href="staff_list.jsp?currentPage=<%=currentPage + 1%>">下一页</a> <a
					href="staff_list.jsp?currentPage=<%=pageBean.getTotalPage()%>">尾页</a>
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

