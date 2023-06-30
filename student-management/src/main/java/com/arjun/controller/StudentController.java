package com.arjun.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arjun.DAO.StudentDAO;
import com.arjun.api.Student;
import com.arjun.api.StudentDTO;


@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/showStudents")
	public String showStudentList(Model model) {
		
		List<Student> studentList=studentDAO.loadStudents();
		model.addAttribute("students",studentList);
		return "student-list";
	}
	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		StudentDTO studentdto=new StudentDTO();
		model.addAttribute("student",studentdto);
		return "add-student";
	}

	@ResponseBody
	@GetMapping("/save-student")
	public String saveStudent(StudentDTO studentdto) {
		//write the logic to save to the database
		System.out.println(studentdto);
		studentDAO.saveStudent(studentdto);
		return "student saved...";
	}
	
}
