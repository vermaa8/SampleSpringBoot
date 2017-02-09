package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	public void updatestudent(Student student, String id) {
		
		studentRepository.save(student);
	}

	public void deleteStudent(String id) {
		studentRepository.delete(id);
	}
}
