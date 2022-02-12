package com.stumgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stumgmt.dao.StudentDAO;
import com.stumgmt.dto.StudentsDTO;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<StudentsDTO> loadStudent() {
		// Business logic
		List<StudentsDTO> students = studentDAO.loadStudent();
		return students;
	}

	@Override
	public void saveStudent(StudentsDTO dto) {
		// Business logic
		studentDAO.saveStudent(dto);

	}

	@Override
	public StudentsDTO getStudent(int id) {
		StudentsDTO student = studentDAO.getStudent(id);
		return student;
	}

	@Override
	public void updateStudent(StudentsDTO dto) {
		studentDAO.updateStudent(dto);
	}

	@Override
	public void deleteStudent(int id) {
		studentDAO.deleteStudent(id);
		
	}

}
