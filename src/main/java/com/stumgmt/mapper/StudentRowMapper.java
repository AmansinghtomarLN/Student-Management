package com.stumgmt.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.stumgmt.dto.StudentsDTO;

public class StudentRowMapper implements RowMapper<StudentsDTO>{

	@Override
	public StudentsDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentsDTO student = new StudentsDTO();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setMobile(rs.getLong(3));
		student.setCountry(rs.getString(4));
		return student;
	}

}
