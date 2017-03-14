package com.tj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tj.entity.Student;
import com.tj.service.IStudentService;
import com.tj.dao.*;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentMapper studentMapper;
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.insertStudent(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.findStudentById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentMapper.findAllStudents();
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updateStudent(student);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentMapper.deleteStudentById(id);
	}

}
