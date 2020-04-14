package com.cg.Dao;

import java.util.List;

import com.cg.Entities.Student;

public interface StudentDaoI {
	public void create(Student s);
	public List retrive();
	public Student findby(int id);
	public void delete(int id);
	public void update(int id,Student s);


}
