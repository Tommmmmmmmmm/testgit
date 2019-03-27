package com.qin.PaymentSystem.mapper;

import com.qin.PaymentSystem.entity.Admin;

public interface AdminMapper {
	Admin findById(int id);
	String findPassword(String admin_name);
}
