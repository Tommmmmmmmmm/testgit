package com.qin.PaymentSystem.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qin.PaymentSystem.service.TeacherService;

@Controller
public class TeacherController {
	@Resource
	private TeacherService teacherService;
	@RequestMapping("/tmain")
	public String toTmain(Model model) {
		return "tmain";
	}
}
