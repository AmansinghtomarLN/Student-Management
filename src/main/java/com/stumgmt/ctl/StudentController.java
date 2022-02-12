package com.stumgmt.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stumgmt.dao.StudentDAO;
import com.stumgmt.dto.StudentsDTO;
import com.stumgmt.service.StudentService;
import com.stumgmt.service.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

// both are same or equivalent	
	@RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		List<StudentsDTO> studentList = studentService.loadStudent();
		model.addAttribute("students", studentList);
		return "student-list";
	}

	@RequestMapping(value = "/showAddStudentPage", method = RequestMethod.GET)
	public String showAddStudentPage(Model model) {
		model.addAttribute("student", new StudentsDTO());
		return "add-student";
	}

	@RequestMapping(value = "/save-student")
	public String saveStudent(StudentsDTO dto, Model model) {
		System.out.println(dto);
		if(dto.getId()==0) {
			studentService.saveStudent(dto);
		}else {
			studentService.updateStudent(dto);
		}
		
		model.addAttribute("student", dto);
		return "redirect:/thank-you"; // PRG - Post Redirect get
	}

	@ResponseBody
	@RequestMapping("/thank-you")
	public String thankYou() {
		return "Thank you for Registering....";
	}

	@RequestMapping("/updateStudent")
	public String updateStudent(Model model, @RequestParam("userId") int id) {
		StudentsDTO student = studentService.getStudent(id);
		System.out.println("controller : "+student);
		model.addAttribute("student", student);

		return "add-student";
	}
}
