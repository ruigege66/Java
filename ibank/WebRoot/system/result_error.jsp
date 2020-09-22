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
<title>修改账户密码</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/personal.css" />
<script type="text/javascript">

function check(){
	if(document.getElementById("accid").value==""){alert("请输入账户号");return false;}
	if(document.getElementById("oldpassword").value==""){alert("请输入密码");return false;}
	if(document.getElementById("newpassword").value==""){alert("请输入新密码");return false;}
	if(document.getElementById("newpwd").value==""){alert("请再次输入新密码");return false;}
	if(document.getElementById("newpassword").value!=document.getElementById("newpwd").value){alert("两次输入的密码不一样，请重新输入");document.getElementById("accpassword").value="";document.getElementById("accpwd").value="";return false;}
}
</script>
</head>
<body>
<table width="100%" class="top" cellpadding="0" cellspacing="0">
	<tr>
		<td>
			&nbsp;当前位置:&nbsp;
			<a href="http://localhost:8080/ibank/system/index.jsp" onclick="return false;">首页</a>&nbsp;>>&nbsp;
			<a href="#">个人业务</a>&nbsp;>>&nbsp;
			<a href="#">操作失败</a>
		</td>
	</tr>
</table>
<s:div cssStyle="margin:40px 0 0 30px">
	<s:label><%=request.getAttribute("error") %></s:label>
	<br/>
	<br/>
    <a href="http://localhost:8080/ibank/system/main_right.jsp"><span>返回首页</span></a>
    <a href="#" onclick="history.go(-1);return false;"><span>返回上一页</span></a>
</s:div>
</body>
</html>
