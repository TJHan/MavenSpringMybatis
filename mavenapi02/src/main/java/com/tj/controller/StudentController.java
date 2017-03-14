package com.tj.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

import com.tj.entity.Student;
import com.tj.service.IStudentService;

@RestController
public class StudentController {

	@Resource
	private IStudentService studentService;

	/*
	 * find a student by id
	 * */
	@RequestMapping(value="/student/{id}",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id)
	{
		System.out.println("searching the student...");
		Student entity = studentService.getStudentById(id);
//		Student entity=new Student();
//		entity.setAge(20);
//		entity.setName("·µ»Ø");
		if(entity ==null)
		{
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Student>(entity,HttpStatus.OK);
	}

	@RequestMapping(value="/student/",method=RequestMethod.POST)
	public ResponseEntity<Void> insertStudent(@RequestBody Student student)
	{
		Student entity=new Student();
		entity.setAge(student.getAge());
		entity.setBirthday(student.getBirthday());
		entity.setDescription(student.getDescription());
		entity.setName(student.getName());
		studentService.addStudent(entity);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public ResponseEntity<List<Student>> getAllStudent()
	{
		List<Student> list=studentService.getAllStudent();
		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);		
	}
	
	@RequestMapping(value="/student/{id}",method=RequestMethod.PUT)
	public ResponseEntity<Student> updateStudent(@PathVariable("id") int id,@RequestBody Student student)
	{
		System.out.println("Updating the student " + id);
		Student current=studentService.getStudentById(id);
		if(current == null)
		{
			System.out.println("Student not found.");
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		current.setName(student.getName());
		current.setAge(student.getAge());
		current.setBirthday(student.getBirthday());
		current.setDescription(student.getDescription());
		studentService.updateStudent(current);
		return new ResponseEntity<Student>(current,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="",method=RequestMethod.DELETE)
	public ResponseEntity<Student> deleteStudent(@PathVariable("id") int id)
	{
		System.out.println("Deleting the student...");
		Student current=studentService.getStudentById(id);
		if(current==null)
		{
			System.out.println("Student not found. unable to delete.");
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
		studentService.deleteStudent(id);
		return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
	}
}
