package com.cg.Service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.StudentDaoI;
import com.cg.Entities.Student;

@Service
public class StudentServiceImpl implements StudentServiceI {
@Autowired
	StudentDaoI studao;
	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		studao.create(s);

	}

	@Override
	public List retrive() {
		// TODO Auto-generated method stub
		return studao.retrive();
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return studao.findby(id);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Student temp=studao.findby(id);
		if(temp!=null)
		studao.delete(id);
		else
			throw new RuntimeException("no id exists");
		
		
	}
	@Override
	public void update(int id,Student s)
	{
		Student st=studao.findby(id);
		if(st!=null)
	    studao.update(id,s);
		else
			throw new RuntimeException("ID does mot exists");
	}
	
	

}
