package com.biz.domain;

/*
 * domain 객체
 * 주로 1개의 데이터를 담아서 이동, 처리 하는 용도로 사용하는 클래스(객체)들
 * 클래스를 객체로 선언하고 초기화 할때 호출하는 생성자는 매개변수가 없는 기본 생성자
 * 필드변수 리스트를 매개변수로 받아서 필드변수 값을 지정하는 필드 생성자를 만들수 있다. 
 */

public class AddrVO 
{
	/*
	 * 필드변수가 String을 포함한 primitive(기본형) 변수형 일때는 초기화가 자동으로 이루어진다.
	 * 문자열 "", 숫자는 0
	 * 
	 * Primitive(기본형) 변수형
	 * 	int, float, doulbe, boolean, char
	 * 
	 * Wrapper Class(기본 확장형) 변수형
	 *  Integer, Float, Double, Long, Boolean, Character
	 *  
	 * 특별히 클래스 이면서 Primitive처럼 동작하는 변수형
	 *  String
	 */
	
	private int age;
	private String net;
	private String tel;
	private String name;
	private String addr;
	
	// 객체 생성될때 필드변수들을 특별히 값을 만들어주고 싶을때 임의로 기본 생성자를 만들고 
	// 필드변수들에 값을 Setting 할 수 있다.
	public AddrVO()
	{
		this.name = "이름을 입력 하세요";
		this.tel = "전화번호를 입력하세요";
		this.addr = "주소를 입력하세요";
		this.age = 0;
		this.net = "관계를 입력하세요";
	}
	
	// 필드변수 생성자
	// 객체를 초기화 하면서 동시에 데이터를 Setting하고자 할때 호출하는 생성자
	public AddrVO(int age, String net, String tel, String name, String addr) 
	{
		super();
		this.age = age;
		this.net = net;
		this.tel = tel;
		this.name = name;
		this.addr = addr;
	}

	public AddrVO(int age, String tel) 
	{
		super();
		this.age = age;
		this.tel = tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
