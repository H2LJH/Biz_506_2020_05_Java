package com.biz.grade;

import com.biz.score.Student;

public class Garde_06 
{
	public static void main(String[] args) 
	{
		String str_name = "홍길동";
		str_name = "성춘향";
		String str_n = str_name;
		System.out.println(str_n);
		
		int age = 27;
		String tel = "010-2323-2323";
		System.out.println(age);
		System.out.println(tel);
		
		Student st = new Student();
		st.make();
		str_n = st.get_name();
		System.out.println(str_n);
		
		age = st.get_age();
		tel = st.get_tel();
		System.out.println(age);
		System.out.println(tel);
		
	}
}
