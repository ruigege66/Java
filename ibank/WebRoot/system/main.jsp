<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	if (session.getAttribute("admin") == null) {
		response.sendRedirect("index");
	}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
 
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>银行业务系统</title>
<style>
* {
	margin: 0 auto;
	padding: 0;
	border: 0;
}
</style>

</head>
<frameset rows="82,*" frameborder="0" border="0" framespacing="0">
	<frame src="main_top.jsp" name="top" scrolling="No" noresize="noresize"
	id="top" /> 
	<frame src="main_middel.html" name="center" id="center" />
</frameset>
<noframes>
	<body>
	</body>
</noframes>
</html>

