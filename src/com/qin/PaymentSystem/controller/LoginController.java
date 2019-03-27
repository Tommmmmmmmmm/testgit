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
		String[] indents=request.getParameterValues("ident");//��ȡ�û����
		if(indents==null) 
			return "error";
		String indent=indents[0];
		if(indent.equals("student")) {//�ж��û�Ϊѧ��
			String pasw=stuService.findPassword(username)  ;//�����ύ��ѧ���ҵ�����
			String strUsername=""+username;
			if(pasw!=null) {                 //���벻Ϊ��
				if(password.equals(pasw)) {  //�ҵ�����
					session.setAttribute("stu", strUsername);//����������sno��Ϊ��
					return "redirect:/main.action";
				}
		    }
		}else if(indent.equals("teacher")) {//�ж��û�Ϊ��ʦ
			String paswd=teacherService.findPassword(username);//�����ύ��ѧ���ҵ�����
			String tUsername=""+username;
			System.out.println("�ύ��ѧ��:"+username);
			System.out.println("�ҵ�������:"+paswd);
			if(paswd!=null) {                 //���벻Ϊ��
				if(password.equals(paswd)) {  //�ҵ�����
					session.setAttribute("teacher", tUsername);//����������sno��Ϊ��
					return "redirect:/tmain.action";
				}
		    }
		}else if(indent.equals("admin")) {
			
		}
		
		return "error"; 
	}
	
	@RequestMapping("stuRegist")
	public String regist(Stu stu,Model model){
		System.out.println("���뵽�û�ע�������");
		System.out.println(stu.getSgender()+"*************");
		stuService.add(stu);
		model.addAttribute("msg", "��ϲ��ע��ɹ�");
//		//ע��ɹ�����תsuccess.jspҳ��
		return "success";
	}
	@RequestMapping("tchRegist")
	public String regist(Teacher teacher,Model model){
//		stu.setId(1);
//		//stuService.regist(stu);
		teacherService.add(teacher);
		model.addAttribute("msg", "��ϲ��ע��ɹ�");
//		model.addAttribute("msg", "ע��ɹ�");
//		//ע��ɹ�����תsuccess.jspҳ��
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
