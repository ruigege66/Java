package com.ibank.interceptor;

import com.ibank.bean.Admin;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import java.util.Map;

@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor {
	/**struts2拦截器主方法*/
	public String intercept(ActionInvocation arg0) throws Exception {
		@SuppressWarnings("rawtypes")
		//从拦截器参数中获取session
		Map session = arg0.getInvocationContext().getSession();
		Object object = session.get("admin");
		//判断是否含有操作员信息
		if ((object instanceof Admin)) {
			Admin admin = (Admin) object;
			if (admin == null || "".equals(admin));
			//继续执行下一个拦截器
			arg0.invoke();
		} else {
			ActionContext ac = arg0.getInvocationContext();
			ac.put("error", "您还没有登录,请登录");
			//返回登录result
			return "login";
		}
		return null;
	}
}