package com.qin.PaymentSystem.service;

import java.util.List;

import com.qin.PaymentSystem.entity.Stu;

public interface StuService {
	List<Stu> list();
	void add(Stu stu);
	void delete(Integer id);
	void update(Stu stu);
	Stu  findById(int id);
	String findPassword(int sno);//根据学号找到密码
}
