package com.arjun.service;

import java.util.List;

import com.arjun.api.Student;
import com.arjun.api.StudentDTO;

public interface StudentService {
	 List<Student> loadstudents();

	void saveStudent(StudentDTO studentdto);
	Student getStudent(int id);

	void update(StudentDTO studentdto);
	void deleteStudent(int id);
}
