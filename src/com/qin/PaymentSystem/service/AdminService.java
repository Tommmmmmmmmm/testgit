package com.qin.PaymentSystem.service;

import com.qin.PaymentSystem.entity.Admin;

public interface AdminService {
	Admin findById(int id);
	String findPassword(String admin_name);
}
