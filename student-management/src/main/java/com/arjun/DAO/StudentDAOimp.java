package com.arjun.DAO;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	     
	     System.out.println("1 record inserted");
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		String sql="select *from students where id=?";
		Student student=jdbctemp.queryForObject(sql,new StudentRowMapper(),id);
		return student;
	}

	@Override
	public void update(StudentDTO studentdto) {
		
		String sql="update students set  name=?, mobile=?, country=? where id=?";
		jdbctemp.update(sql,studentdto.getName(),studentdto.getMobile(),studentdto.getCountry(),studentdto.getId());
		System.out.println("1 record updated");
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		String sql="DELETE FROM STUDENTS WHERE ID=?";
		jdbctemp.update(sql,id);
	}

	

}
