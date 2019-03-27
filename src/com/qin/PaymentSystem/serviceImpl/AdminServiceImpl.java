package com.qin.PaymentSystem.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qin.PaymentSystem.entity.Admin;
import com.qin.PaymentSystem.mapper.AdminMapper;
import com.qin.PaymentSystem.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Resource
	private AdminMapper adminMapper;
	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPassword(String admin_name) {
		String password=adminMapper.findPassword(admin_name);
		return password;
	}

}
