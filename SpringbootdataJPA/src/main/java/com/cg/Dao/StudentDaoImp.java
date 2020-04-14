package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entities.Student;
@Repository
@Transactional
public class StudentDaoImp implements StudentDaoI {
	@PersistenceContext
	EntityManager em;
	

	@Override
	public void create(Student s) {
		// TODO Auto-generated method stub
		em.persist(s);//this object will make a reference in database table


	}


	@Override
	public List retrive() {
		// TODO Auto-generated method stu
		Query q=em.createQuery("select s from Student s");
		
		return q.getResultList();
	}


	@Override
	public Student findby(int id) {
		// TODO Auto-generated method stub
		return em.find(Student.class,id);
		
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Student f=em.find(Student.class,id);
		em.remove(f);
		
	}


	@Override
	public void update(int id,Student s) {
		// TODO Auto-generated method stub
		em.merge(s);
		
		

		
	}


	

}
