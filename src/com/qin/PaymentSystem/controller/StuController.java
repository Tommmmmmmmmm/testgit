package com.qin.PaymentSystem.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qin.PaymentSystem.service.StuService;

@Controller
public class StuController {
	@Resource
	private StuService stuService;
	@RequestMapping("/main")
	public String toMain(Model model) {
		
		return "main";
		
	}
}
