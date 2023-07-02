package com.arjun.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.arjun.api.Student;
import com.arjun.api.StudentDTO;
import com.arjun.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudents")
	public String showStudentList(Model model) {
		// call the service to get the data
		List<Student> studentList = studentService.loadstudents();
		model.addAttribute("students", studentList);
		return "student-list";
	}

	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		StudentDTO studentdto = new StudentDTO();
		model.addAttribute("student", studentdto);
		return "add-student";
	}

	@PostMapping("/save-student")
	public String saveStudent(StudentDTO studentdto) {
		// write the logic to save to the database
		System.out.println(studentdto);
		// do a service call
		if(studentdto.getId()==0) {
			studentService.saveStudent(studentdto);
		}
		else {
			// do a update
			studentService.update(studentdto);
		}
		return "redirect:/showStudents";
	}

	@GetMapping("/updateStudent")
	public String updateStudents(@RequestParam("userId") int id, Model model) {

		System.out.println("looking data for the student having id :" + id);

		Student mystudent = studentService.getStudent(id);
		System.out.println(mystudent);
		// setting the student info
//		studentdto.setId(mystudent.getId());
//		studentdto.setName(mystudent.getName());
//		studentdto.setMobile(mystudent.getMobile());
//		studentdto.setCountry(mystudent.getCountry());
		model.addAttribute("student", mystudent);
		return "add-student";
	}
	
	@GetMapping("/deleteStudent")
	public String deletestudent(@RequestParam("userId") int id, Model model) {

		System.out.println("looking data for the student having id :" + id);
		
		studentService. deleteStudent(id);
		return "redirect:/showStudents";
	}

}
