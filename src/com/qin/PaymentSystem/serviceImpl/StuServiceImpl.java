package com.qin.PaymentSystem.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qin.PaymentSystem.entity.Stu;
import com.qin.PaymentSystem.mapper.StuMapper;
import com.qin.PaymentSystem.service.StuService;
@Service
public class StuServiceImpl implements StuService{
	@Resource
	private StuMapper stuMapper;

	@Override
	public List<Stu> list() {
		return stuMapper.findAll();
	}

	@Override
	public void add(Stu stu) {
		stuMapper.add(stu);
	}

	@Override
	public void delete(Integer id) {
		
	}

	@Override
	public void update(Stu stu) {
		
	}

	@Override
	public Stu findById(int id) {//根据id找到实体类
		Stu stu=stuMapper.findById(id);
		return stu;
	}

	@Override
	public String findPassword(int sno) {//根据学号找到密码
		String passWord=stuMapper.findPassword(sno);
		return passWord;
	}

	

}
