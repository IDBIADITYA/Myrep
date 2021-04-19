package com.sjp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sjp.Model.Student;
import com.sjp.Repository.StudentRepository;

@RestController
@RequestMapping("/Myapi/v1")
public class StudentController {
	@Autowired
	private StudentRepository studentrepository;
	@GetMapping("/Student")
	public List<Student>getAllStudent()
	{
		return studentrepository.findAll();
	}

}
