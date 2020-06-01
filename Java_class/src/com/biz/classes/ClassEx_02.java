package com.biz.classes;

import com.biz.classes.model.Student;

public class ClassEx_02 
{
	public static void main(String[] args) 
	{
		Student student = new Student(); // 인스턴스, 객체(object) 생성
		
		student.set_name(); // class set_name method
		student.str_name = "홍길동";
		
		System.out.println(student.str_name); // student 객체에 맴버변수 읽기
	}
}
