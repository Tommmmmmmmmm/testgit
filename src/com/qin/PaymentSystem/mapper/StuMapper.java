package com.qin.PaymentSystem.mapper;

import java.util.List;
import com.qin.PaymentSystem.entity.Stu;

public interface StuMapper {
	List<Stu> findAll();
	void add(Stu stu);
	void delete(int id);
	void update(Stu stu);
	Stu findById(int id);
	String findPassword(int sno);//����ѧ���ҵ�����
	
}
