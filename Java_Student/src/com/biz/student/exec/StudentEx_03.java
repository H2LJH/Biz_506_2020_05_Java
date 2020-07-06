package com.biz.student.exec;

import com.biz.sudent.service.StudentService;
import com.biz.sudent.service.StudentServiceImplV5;

public class StudentEx_03 
{
	public static void main(String[] args) 
	{
		StudentService sService = new StudentServiceImplV5();
		
		sService.inputStudent();
		sService.studentList();
	}
}
