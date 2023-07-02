package com.arjun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arjun.DAO.StudentDAO;
import com.arjun.api.Student;
import com.arjun.api.StudentDTO;

@Service
public class StudentServiceimpl implements StudentService {

	@Autowired
	StudentDAO studentdao;
	
	
	@Override
	public List<Student> loadstudents() {
		List<Student> studentlist=studentdao.loadStudents();
		return studentlist;
	}


	@Override
	public void saveStudent(StudentDTO studentdto) {
		//write the buissness logic
		if(studentdto.getCountry()=="india") {
			//write the email sending logic right here
			System.out.println("mail sent to:"+studentdto.getName());
		}
			studentdao.saveStudent(studentdto);
	}


	@Override
	public Student getStudent(int id) {
		
		Student student=studentdao.getStudent(id);
		return student;
	}


	@Override
	public void update(StudentDTO studentdto) {
		studentdao.update(studentdto);
		
	}


	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentdao.deleteStudent(id);
	}

}
