<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.ibank.service.impl.*"%>
<%@ page import="com.ibank.bean.*"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
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
		<title>存款利率调整</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" type="text/css" href="css/personal.css" />
		<style type="text/css">
.button {
	margin-left: 0px
}

.text {
	width: 100px
}
</style>
		<script type="text/javascript">
	function check() {
		var flag=window.confirm('是否确认修改利率？');
		if(!flag){
			return false;
		}
		if (document.getElementById("newinterest").value == "") {
			alert("请输入新的利率");
			return false;
		}
		if (document.getElementById("interestid").value == "") {
			alert("请选择要调整的利率类型");
			return false;
		}
	}
	function sendvalue(value1, value2, value3, value4) {
		document.getElementById(value1).value = value2;
		document.getElementById(value3).value = value4;
	}
</script>
	</head>
	<body>
		<table width="100%" class="top" cellpadding="0" cellspacing="0">
			<tr>
				<td>
					&nbsp;当前位置:&nbsp;
					<a href="#">首页</a>&nbsp;>>&nbsp;
					<a href="#">银行事务</a>&nbsp;>>&nbsp;
					<a href="#">利率调整</a>
				</td>
			</tr>
		</table>

		<div align="center">
			<br />
			<fieldset style='width: 95%; height: 80%; margin-top: 10px'>
				<legend>
					选择要调整的银行存款利率
				</legend>
				<br />
				<%
					InterestSerivecImpl impl = new InterestSerivecImpl();
					//获得所有的利率结果集
					List<?> list = impl.getinterest("from Interest");
					//定义编号起始数
					int i = 1;
					//循环输出利率信息到html
					for (Object o : list) {
						Interest interest = (Interest) o;
				%>
				<div class='line'>
					<div align="left" class='leftDiv'>
						<input type="radio" name="interest"
							value="<%=interest.getInterestid()%>" id="interest<%=i%>"
							onclick="sendvalue('interestid','<%=interest.getInterestid()%>','name','<%=interest.getName()%>')" />
						<%=i%>.<%=interest.getName()%>:
					</div>
					<div align="left" class='rightDiv'>
						<%=interest.getValue()%>/年
					</div>
				</div>
				<%
					i++;
					}
				%>
				<form action="readjustmentofinterestrate" method="POST"
					onsubmit="return check()">
					<div class='line'>
						<div align="left" class='leftDiv'>
							输入新的利息值：
						</div>
						<div align="left" class='rightDiv'>
							<input type="text" name="interest.value" class="text"
								id="newinterest" />
							<input type="hidden" name="interest.interestid" id="interestid" />
							<input type="hidden" name="interest.name" id="name" />
						</div>
					</div>
					<div class='line' style='height: 40px;'>
						<div align="left" class='leftDiv'>
							<input type="reset" name="btn" value=" 重置信息 " class="button">
						</div>
						<div align="left" class='rightDiv'>
							<input type="submit" name="btn" value=" 修改利率 " class="button">
						</div>
					</div>
				</form>
			</fieldset>
		</div>

	</body>
</html>
