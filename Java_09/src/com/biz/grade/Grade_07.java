package com.biz.grade;

import com.biz.score.Student;

public class Grade_07 
{
	public static void main(String[] args) 
	{
		Student 홍길동 = new Student();
		Student 이몽룡 = new Student();
		Student 성춘향 = new Student();
		
		홍길동.str_name = "홍길동";
		홍길동.age = 38;
		홍길동.str_tel = "010-111";

		이몽룡.str_name = "이몽룡";
		이몽룡.age = 22;
		이몽룡.str_tel = "010-112";
		
		성춘향.str_name = "성춘향";
		성춘향.age = 18;
		성춘향.str_tel = "010-113";
		
		System.out.println("홍길동 이름 : " + 홍길동.get_name());
		System.out.println("홍길동 나이 : " + 홍길동.get_age());
		System.out.println("홍길동 전회 : " + 홍길동.get_tel());
		
		System.out.println("이몽룡 이름 : " + 이몽룡.get_name());
		System.out.println("이몽룡 나이 : " + 이몽룡.get_age());
		System.out.println("이몽룡 전화 : " + 이몽룡.get_tel());
		
		System.out.println("성춘향 이름 : " + 성춘향.get_name());
		System.out.println("성춘향 나이 : " + 성춘향.get_age());
		System.out.println("성춘향 전화 : " + 성춘향.get_tel());
	}
}
