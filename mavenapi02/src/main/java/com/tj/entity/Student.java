package com.tj.entity;

import java.util.Date;

public class Student {
	private int studentid;
	private String name;
	private int age;
	private Date birthday;
	private String description;
	
	public int getStudentID()
	{
		return this.studentid;
	}
	public void setStudentID(int studentid)
	{
		this.studentid = studentid;
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public Date getBirthday()
	{
		return this.birthday;
	}
	public void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}
	public String getDescription()
	{
		return this.description;
	}
	public void setDescription(String description)
	{
		this.description = description;
	}
}
