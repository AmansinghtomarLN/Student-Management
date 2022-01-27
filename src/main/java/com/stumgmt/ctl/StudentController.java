package com.stumgmt.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.stumgmt.dao.StudentDAO;
import com.stumgmt.dto.StudentsDTO;

@Controller
public class StudentController {

	@Autowired
	private StudentDAO StudentDAO;

// both are same or equivalent	
	@RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		List<StudentsDTO> studentList = StudentDAO.loadStudent();
		model.addAttribute("students", studentList);
		return "student-list";
	}

}
