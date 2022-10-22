package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {

		String query = "insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return r;
	}

	

	public int change(Student student) {
		//update
		String query ="update student set name =? , city=? where id=?";
		int u = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return u;
	}
	
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int d = this.jdbcTemplate.update(query,studentId);
		return d;
	}
	
	public Student getStudent(int studentId) {
		// select
		String query = "select * from student where id=?";
		RowMapper <Student> rowMapper= new RowMapperimpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper,studentId);		
		return student;
	}
	

	public List<Student> getAllStudents() {
		// selecting multiple student
		
		String q = "select * from student";
		List<Student> students = this.jdbcTemplate.query(q,new RowMapperimpl());
		
		return students;
	}
	
	

	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}






	


	






}
