package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entities.Student;
import com.cg.Service.StudentServiceI;
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:57737"})
@RestController
public class StudentController {
	@Autowired
	StudentServiceI student;
	
	@GetMapping("/student")
	public List<Student> fetchstudents()
	{
		return student.retrive();
	}
	@GetMapping("/student/{id}")
	public Student finbyid(@PathVariable int id)
	{
		return student.findById(id);
	}
	@PostMapping(value = "/student")
	public String add(@RequestBody Student s)
	{
		student.create(s);
		return "added";
	}
	@DeleteMapping(value = "/student/delete/{id}")
	public String delete(@PathVariable int id)
	{student.delete(id);
		return "deleted";
	}
	@PutMapping(value="/student/{id}")
	public String update(@PathVariable int id,@RequestBody Student s)
	{
		student.update(id, s);
		return "updated";
		
	}

}
