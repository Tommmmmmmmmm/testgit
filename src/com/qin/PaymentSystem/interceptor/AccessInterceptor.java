package com.qin.PaymentSystem.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AccessInterceptor implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, 
			Object obj) throws Exception {
		HttpSession session=request.getSession();
		String sno=(String)session.getAttribute("stu");
		String tno=(String)session.getAttribute("teacher");
		System.out.println("À¹½ØÆ÷"+sno);
		System.out.println("À¹½ØÆ÷"+tno);
		if(sno==null&&tno==null){
        	  response.sendRedirect("login/login.jsp");
        	  return false;
		}
		return true;
	}

}
