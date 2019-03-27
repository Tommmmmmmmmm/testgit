package com.qin.PaymentSystem.mapper;

import java.util.List;

import com.qin.PaymentSystem.entity.Teacher;

public interface TeacherMapper {
	List<Teacher> findAll();
	void add(Teacher teacher);
	void delete(int id);
	void update(Teacher teacher);
	Teacher findById(int id);
	String findPassword(int tno);
}
