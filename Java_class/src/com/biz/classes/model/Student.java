package com.biz.classes.model;

/*
 * class에는 변수, method가 존재한다.
 */
public class Student 
{
	// 맴버변수, 필드변수, 속성(Property)
	public  String str_name;
	public  String str_tel;
	private String str_addr;
	
	private int age;
	public  int grade;
	
	String rem; // 맴버변수는 클래스가 저장된 패키지가 같으면  public, 패키지가 다르면 private 이다.
	
	
	// method, class 종속 함수
	// public  : 접근제한자 (전부 접근 가능) 
	// private :  ""        (클래스 내부에서만 접근 가능)
	public void set_name()
	{

	}
	
}
