package com.stumgmt.dao;

import java.util.List;

import com.stumgmt.dto.StudentsDTO;

public interface StudentDAO {

	List<StudentsDTO>loadStudent();
	void saveStudent(StudentsDTO dto);
	StudentsDTO getStudent(int id);
	void updateStudent(StudentsDTO dto);
	void deleteStudent(int id);
	
}
