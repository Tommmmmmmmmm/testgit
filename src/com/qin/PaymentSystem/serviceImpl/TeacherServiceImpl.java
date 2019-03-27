package com.qin.PaymentSystem.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qin.PaymentSystem.entity.Teacher;
import com.qin.PaymentSystem.mapper.TeacherMapper;
import com.qin.PaymentSystem.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{
	@Resource
	private TeacherMapper teacherMapper;
	@Override
	public List<Teacher> list() {
		return teacherMapper.findAll();
	}

	@Override
	public void add(Teacher teacher) {
		teacherMapper.add(teacher);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Teacher findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPassword(int tno) {
		String password=teacherMapper.findPassword(tno);
		return password;
	}

}
