package com.example.STUDENTCRUD1.controller;

import java.util.List;
import com.example.STUDENTCRUD1.model.Student;
import com.example.STUDENTCRUD1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	
	@Autowired
	private StudentRepository repo;
	
	@PostMapping("")
	public String create(@ModelAttribute Student student) {
		repo.save(student);
		System.out.println("Saved: " + student.getname() + " " + student.getgrade());
		return "redirect:/form.html";
	}

	@GetMapping("")
	@ResponseBody
	public List<Student> list(){
		return repo.findAll();
	}
	
	  // GET /students/{id}
	   @GetMapping("/{id}")
	   @ResponseBody
	   public Student get(@PathVariable Long id) {
	       return repo.findById(id).orElse(null);
	   }
	
	@PutMapping("/{id}")
	public Student get(@PathVariable long id, @RequestBody Student student) {
		student.setId(id);
		return repo.save(student);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repo.deleteById(id);
	}
}
