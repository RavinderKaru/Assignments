package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.Dao.StudentDaoI;
import com.cg.Entities.Student;

@SpringBootApplication
public class SpringbootdataJpaApplication{
@Autowired
StudentDaoI s;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdataJpaApplication.class, args);
	}
}
	//@Override
	//public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * Student s1=new Student(1,"sachin", "cr"); Student s2=new Student(2,"ravi",
		 * "th"); Student s3=new Student(3,"goo", "td"); s.create(s1); s.create(s2);
		 * s.create(s3); System.out.println("INSETRED");
		 */
		/*
		 * List<Student> d= s.retrive(); for (Student s:d) {
		 * System.out.println(s.getId()); System.out.println(s.getDept());
		 * System.out.println(s.getName());
		 * 
		 * }
		 */
		
		/*Student f=s.findby(2);
		System.out.println(f.getId());
	*/
/*s.delete(2);
s.update(2);
}*/
//}
