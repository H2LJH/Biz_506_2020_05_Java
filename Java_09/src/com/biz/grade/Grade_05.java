package com.biz.grade;

import com.biz.score.Student;
public class Grade_05 
{
	public static void main(String[] args) 
	{
		// sum은 몇일까 ?
		int sum = 0;
		for(int i=0; i<100000; ++i)
			sum = 100;
		// sum은 100이다  main method 시작시 메모리에 저장 되는 전역변수(sum)를 sum = 100 이라고 할당 했기 때문.
		
		for(int i=0; i<10; ++i)
			System.out.println(sum);
		 
		
		Student student = new Student();
		student.make(); // Student class에 선언된 make() 메서드를 호출하기
		
		String str_n = student.get_name();
		System.out.println(str_n);
		
		System.out.println(student.get_name());
		
	}
}
