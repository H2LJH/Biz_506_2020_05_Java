package com.biz.score;

public class Student 
{
	public int age = 33;
	public String str_name = "홍길동";
	public String str_tel = "";
	
	public void make()
	{
		str_name = "성춘향";
		age = 16;
		str_tel = "010-1212-1212";
	}
	
	public String get_name()
	{
		return str_name;
	}
	
	public int get_age()
	{
		return age;
	}
	
	public String get_tel()
	{
		return str_tel;
	}
	
}
