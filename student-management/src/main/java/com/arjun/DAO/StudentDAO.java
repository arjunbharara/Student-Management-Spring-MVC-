package com.arjun.DAO;

import java.util.List;

import com.arjun.api.Student;
import com.arjun.api.StudentDTO;

public interface StudentDAO {
	List<Student> loadStudents();
	void saveStudent(StudentDTO studentdto);
}
