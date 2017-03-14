package com.tj.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tj.dao.IStudentMapper;
import com.tj.entity.Student;

@RestController
public class StudentController {

//	private IStudentMapper studentMapper;

	/*
	 * find a student by id
	 * */
	@RequestMapping(value="/student/{id}",method=RequestMethod.GET)
	public ResponseEntity<Student> getStudent(@PathVariable("id") int id)
	{
//		Student entity=studentMapper.findStudentById(id);
		Student entity=new Student();
		entity.setAge(20);
		entity.setName("测试测试");
//		if(entity ==null)
//		{
//			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
//		}
		return new ResponseEntity<Student>(entity,HttpStatus.OK);
	}
//	
//	@RequestMapping(value="/student/",method=RequestMethod.POST)
//	public ResponseEntity<Void> insertStudent(@RequestBody Student student)
//	{
//		Student entity=new Student();
//		entity.setAge(student.getAge());
//		entity.setBirthday(student.getBirthday());
//		entity.setDescription(student.getDescription());
//		entity.setName(student.getName());
//		studentMapper.insertStudent(entity);
//		return new ResponseEntity<Void>(HttpStatus.CREATED);
//	}
//	
//	@RequestMapping(value="/student",method=RequestMethod.GET)
//	public ResponseEntity<List<Student>> getAllStudent()
//	{
//		List<Student> list=studentMapper.findAllStudents();
//		return new ResponseEntity<List<Student>>(list,HttpStatus.OK);		
//	}
}
