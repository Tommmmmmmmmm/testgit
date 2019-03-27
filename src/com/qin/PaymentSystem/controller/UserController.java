//package com.qin.PaymentSystem.controller;
//
//import javax.annotation.Resource;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.qin.PaymentSystem.entity.Stu;
//import com.qin.PaymentSystem.entity.Teacher;
//import com.qin.PaymentSystem.service.StuService;
//import com.qin.PaymentSystem.service.TeacherService;
//@Controller
//@RequestMapping("regist")
//public class UserController {
//	@Resource
//	private StuService stuService;
//	
//	@RequestMapping("stuRegist")
//	public String regist(Stu stu,Model model){
//		System.out.println("进入到用户注册控制器");
//		System.out.println(stu.getSgender()+"*************");
////		stu.setId(1);
////		/stuService.regist(stu);
//		stuService.add(stu);
//		model.addAttribute("msg", "恭喜你注册成功");
////		//注册成功后跳转success.jsp页面
//		return "success";
//	}
//	
//	@Resource
//	private TeacherService teacherService;
//	@RequestMapping("tchRegist")
//	public String regist(Teacher teacher,Model model){
////		stu.setId(1);
////		//stuService.regist(stu);
//		teacherService.add(teacher);
//		model.addAttribute("msg", "恭喜你注册成功");
////		model.addAttribute("msg", "注册成功");
////		//注册成功后跳转success.jsp页面
//		return "success";
//	}
//
//}
