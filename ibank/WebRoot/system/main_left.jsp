<%@ page language="java" import="java.util.*,com.ibank.bean.*"
	pageEncoding="UTF-8"%>
	<%@ page isELIgnored="false" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
		<title>银行业务系统</title>
		<link rel="stylesheet" type="text/css" href="css/style.css" />

	</head>
	<body>
		<div id="menubar">
			<div class="menubar"
				style="background: url(images/list_top.gif) no-repeat;">
				<div class="nav" id="nav">
					<ul>
						<li>
							<a href="content/func.html" target="I2" onclick="return false">业务办理</a>
							<div>
								<p>
									<a href="personal_newaccount.jsp" target="I2">开户</a>
								</p>
								<p>
									<a href="personal_search_balance.jsp" target="I2">查询余额</a>
								</p>
								<p>
									<a href="personal_search_accountstated.jsp" target="I2">查询明细</a>
								</p>
								<p>
									<a href="personal_inputmoney.jsp" target="I2">存款</a>
								</p>
								<p>
									<a href="personal_outputmoney.jsp" target="I2">取款</a>
								</p>
								<p>
									<a href="personal_changepassword.jsp" target="I2">修改密码</a>
								</p>
								<p>
									<a href="personal_reportlost.jsp" target="I2">账号挂失</a>
								</p>
								<p>
									<a href="personal_cancellost.jsp" target="I2">取消挂失</a>
								</p>
								<p>
									<a href="personal_logoff.jsp" target="I2">销户</a>
								</p>
																<p>
									<a href="loan_transaction.jsp" target="I2">贷款办理</a>
								</p>
								<p>
									<a href="loan_repay.jsp" target="I2">贷款还款</a>
								</p>
								<p>
									<a href="loan_query.jsp" target="I2">贷款浏览</a>
								</p>
							</div>
						</li>
						 
						<s:if test="#session.admin.type==3">
							<li>
								<a href="content/advanced.html" target="I2"
									onclick="return false">系统设置</a>
								<div>
									<p>
										<a href="readjustmentofinterestrate.jsp" target="I2">利率调整</a>
									</p>
								</div>
							</li>

							<li>
								<a href="content/seo.html" target="I2" onclick="return false">用户管理</a>
								<div>
									<p>
										<a href="staff_add.jsp" target="I2">增加员工</a>
									</p>
									<p>
										<a href="staff_edit.jsp" target="I2">密码修改</a>
									</p>
									<p>
										<a href="staff_delete.jsp" target="I2">删除员工</a>
									</p>
									<p>
										<a href="staff_list.jsp" target="I2">在职浏览</a>
									</p>
								</div>
							</li>
						</s:if>
					</ul>
				</div>
			</div>
		</div>
		<script type="text/javascript">
var li = document.getElementById("nav");
var tt = li.getElementsByTagName("li");
for(i=0; i<tt.length; i++){
	tt[i].onclick= function(){
		for(j=0; j<tt.length; j++){
			tt[j].className = "";
			this.className  = "current";
		}
	}
}
</script>
	</body>
</html>
