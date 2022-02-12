package com.stumgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stumgmt.dto.StudentsDTO;

@Service
public interface StudentService {

	List<StudentsDTO>loadStudent();
	void saveStudent(StudentsDTO dto);
	StudentsDTO getStudent(int id);
	void updateStudent(StudentsDTO dto);
	void deleteStudent(int id);
}
