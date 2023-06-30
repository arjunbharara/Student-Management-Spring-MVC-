package com.arjun.DAO;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.arjun.api.Student;
import com.arjun.api.StudentDTO;
import com.arjun.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOimp implements StudentDAO {

	@Autowired
	JdbcTemplate jdbctemp;
	
	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		String sql="SELECT *FROM students";
		
		List<Student>query= jdbctemp.query(sql, new StudentRowMapper());
		
		return query;
	}

	@Override
	public void saveStudent(StudentDTO studentdto) {
		//write the logic to store the data in db
		
		Object[] sqlParamters= {studentdto.getName(),studentdto.getMobile(),studentdto.getCountry()};
		
		String sql="insert into students(name,mobile,country) values(?,?,?)";
		
	     jdbctemp.update(sql,sqlParamters);
	     
	     System.out.println("1 record updated");
	}

}
