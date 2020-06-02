package com.biz.classes.model;

// 맴버(필드) 변수가 private이기 때문에 다른 패키지에서 객체(인스턴스)를 통해서 직접 접근이 불가능하다.
//return keyword가 있는 method와 return type이 같아야 한다.

public class Address 
{

	private String city;
	private String gu;
	private String dong;
	private String addr;
	
	private int age;
	 
	// 객체를 통해서 필드변수에 접근 하기 위한 setter method
	// 객체를 통해서 필드변수에 접근 하기 위한 getter method
	public void set_city(String city){
		this.city = city;
		}
	public String get_city() {
		return city;
		}
	
	public void set_age(int age){ 
		this.age = age; 
	}
	public int get_age(){
		return age;
		}
}
