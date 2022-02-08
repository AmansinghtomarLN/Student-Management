package com.stumgmt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.stumgmt.dto.StudentsDTO;
import com.stumgmt.mapper.StudentRowMapper;

@Repository
public class StudentDaoImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<StudentsDTO> loadStudent() {
		String sql = "Select * from students";
		List<StudentsDTO> studentList = jdbcTemplate.query(sql, new StudentRowMapper());
		displayStudent(studentList);
		return studentList;
	}

	public void displayStudent(List<StudentsDTO> student) {
		for (StudentsDTO stu : student) {
			System.out.println(stu);
		}
	}

	@Override
	public void saveStudent(StudentsDTO dto) {
		String sql = "insert into students(name, mobile,country)values(?,?,?) ";
		Object[] args = {dto.getName(), dto.getMobile(), dto.getCountry()};
		jdbcTemplate.update(sql, args);
		System.out.println("Student Record Saved");
	}
}
