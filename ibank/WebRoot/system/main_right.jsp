<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		 
		<title>银行业务系统</title>
		<link href="css/main.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<table width="100%" height="100%" cellpadding="0" cellspacing="0"
			class="table">
			<tr>
				<td valign="top" colspan="3">
					<table width="100%" class="top" cellpadding="0" cellspacing="0">
						<tr>
							<td>
								&nbsp;当前位置:&nbsp;
								<a href="#">首页</a>&nbsp;>>&nbsp;
								<a href="#">XX支行</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
		<div style="margin-top:40px;width:1000px;height:240px;font-size:14px;">
			<div style="width:1000px;height:60px;background:url(images/bg1.gif);"></div>
			<div style="margin-top:10px;width:1000px;height:320px;float:left;">
				<div style="width:710px;height:165px;margin-top:2px;float:left;margin-left:8px;">
				<b style="margin-left:20px;font-size:14px;padding-top:3px;">功能介绍</b>
				<p style="text-indent: 2em;color:black;line-height:18px">
				银行业务主要分为三类：业务办理、系统设置、用户管理三个模块。 
				</p>
				<p style="text-indent: 2em;color:black;line-height:18px">
				本系统可实现银行初级商业交易和管理功能，业务办理包括个人开户、销户、存款、取款、挂失等，系统设置括利率调整，员工管理包括员工添加、删除、查询等。
				</p>
				
				</div>

				<div style="margin-top:2px;width:254px;height:165px;float:left;margin-left:15px;">
				<b style="margin-left:20px;font-size:14px;padding-top:3px;"></b>
				<br/>
				<p style="text-indent: 2em;color:black;line-height:18px">
				 
				</p>
			</div>
			</div>
		</div>
	</body>
</html>
