package com.ibank.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminFilter implements Filter {
	public void destroy() {
	}
	/**过滤器主方法*/
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		//获得请求
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession(false);
		//判断http session中是否有操作员
		if ((session == null) || (session.getAttribute("admin") == null)
				|| ("".equals(session.getAttribute("admin")))) {
			//若为空，跳转到index 交由struts2 处理
			response.sendRedirect("index");
			return;
		}
		//若不为空，则继续下一步过滤
		arg2.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
}