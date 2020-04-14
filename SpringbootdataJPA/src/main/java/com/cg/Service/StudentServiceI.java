package com.cg.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.Entities.Student;
@Service
public interface StudentServiceI {
	public void create(Student s);
	public List retrive();
	public Student findById(int id);
	public void delete(int id);
	public void update(int id,Student s);

}
