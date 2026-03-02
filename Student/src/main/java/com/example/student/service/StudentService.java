package com.example.student.service;

import java.util.List;

import com.example.student.model.Student;

public interface StudentService {
	
	
	///
	/// methods for implementation
	/// 
	void add(Student s);
	
	List<Student> display();
	
	void delete(Integer id);
	
	Student update(Student s, Integer id);

	
}
