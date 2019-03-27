package com.qin.PaymentSystem.service;

import java.util.List;

import com.qin.PaymentSystem.entity.Teacher;

public interface TeacherService {
	List<Teacher> list();
	void add(Teacher teacher);
	void delete(Integer id);
	void update(Teacher teacher);
	Teacher findById(int id);
	String findPassword(int tno);//根据学号找到密码
}
