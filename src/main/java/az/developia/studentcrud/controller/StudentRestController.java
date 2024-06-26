package az.developia.studentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.studentcrud.model.Student;
import az.developia.studentcrud.repository.StudentRepository;

@RestController
@RequestMapping(path = "/students")
@CrossOrigin(origins = "*")

public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepository;

	@PostMapping
	public Student save(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	@GetMapping
	public List<Student> findAll(){
		return studentRepository.findAll();
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteById(@PathVariable Integer id) {
		studentRepository.deleteById(id);
	}
	
	@PutMapping(path = "{id}")
	public Student findById(@PathVariable Integer id) {
		return studentRepository.findById(id).get();
	}
}












