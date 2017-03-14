package com.tj.test;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tj.entity.Student;
import com.tj.service.IStudentService;

public class MyBatisTest {
	
	private IStudentService studentService;
	
	@Before
	public void before()
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
		studentService = (IStudentService)ac.getBean("studentService");
	}
	
	@Test
	public void testAddStudent()
	{
		Student entity=new Student();
		entity.setAge(10);
		entity.setName("测试");
		entity.setBirthday(new Date());
		entity.setDescription("测试数据");
		studentService.addStudent(entity);
	}
}
