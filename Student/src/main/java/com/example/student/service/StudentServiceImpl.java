package com.example.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.model.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	private StudentRepository sr;

	@Override
	public void add(Student s) {
		sr.save(s);
	}

	@Override
	public List<Student> display() {
		return sr.findAll();
	}

	@Override
	public void delete(Integer id) {
		sr.deleteById(id);
		
	}

	@Override
	public Student update(Student s, Integer id) {
		s.setRoll(id);
		return sr.save(s);
	}

}
