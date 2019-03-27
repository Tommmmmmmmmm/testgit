package com.qin.PaymentSystem.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qin.PaymentSystem.entity.Stu;
import com.qin.PaymentSystem.entity.Teacher;
import com.qin.PaymentSystem.service.StuService;
import com.qin.PaymentSystem.service.TeacherService;
@Controller
@RequestMapping("login")
public class LoginController {
	@Resource
	private StuService stuService;
	@Resource
	private TeacherService teacherService;
	@RequestMapping("login")
	public String login(int username,String password,HttpSession session,HttpServletRequest request) {
		String[] indents=request.getParameterValues("ident");//获取用户身份
		if(indents==null) 
			return "error";
		String indent=indents[0];
		if(indent.equals("student")) {//判断用户为学生
			String pasw=stuService.findPassword(username)  ;//根据提交的学号找到密码
			String strUsername=""+username;
			if(pasw!=null) {                 //密码不为空
				if(password.equals(pasw)) {  //找到密码
					session.setAttribute("stu", strUsername);//告诉拦截器sno不为空
					return "redirect:/main.action";
				}
		    }
		}else if(indent.equals("teacher")) {//判断用户为老师
			String paswd=teacherService.findPassword(username);//根据提交的学号找到密码
			String tUsername=""+username;
			System.out.println("提交的学号:"+username);
			System.out.println("找到的密码:"+paswd);
			if(paswd!=null) {                 //密码不为空
				if(password.equals(paswd)) {  //找到密码
					session.setAttribute("teacher", tUsername);//告诉拦截器sno不为空
					return "redirect:/tmain.action";
				}
		    }
		}else if(indent.equals("admin")) {
			
		}
		
		return "error"; 
	}
	
	@RequestMapping("stuRegist")
	public String regist(Stu stu,Model model){
		System.out.println("进入到用户注册控制器");
		System.out.println(stu.getSgender()+"*************");
		stuService.add(stu);
		model.addAttribute("msg", "恭喜你注册成功");
//		//注册成功后跳转success.jsp页面
		return "success";
	}
	@RequestMapping("tchRegist")
	public String regist(Teacher teacher,Model model){
//		stu.setId(1);
//		//stuService.regist(stu);
		teacherService.add(teacher);
		model.addAttribute("msg", "恭喜你注册成功");
//		model.addAttribute("msg", "注册成功");
//		//注册成功后跳转success.jsp页面
		return "success";
	}
	@RequestMapping("admin")
	public String toAdmin(String name,String password,HttpSession session,HttpServletRequest request) {
		if(name.equals("admin")&&password.equals("000000")) {
			return "admin";
		}
		return "error"; 
	}
}
