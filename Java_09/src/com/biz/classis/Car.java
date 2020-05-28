package com.biz.classis;

/*
 * 1. Car class는 main() method가 없다.
 * 2. 이름 이라는 변수가 클래스 선언 명령문(public class Car) 아래에 바로 선언과 초기화(자동차 문자열 할당)가 되어 있다.
 * 3. 변수 선문 앞에 public 이라는 키워드가 부착되어있다.
 * 4. 전진()...의 method 코드가 있다.
 * 5. Car 클래스를 만들어 사용하는 이유는 재활용(생산성)을 높히기 위함이다.
 */

public class Car // Car class 선언문 
{
	public void 주차(String str_name) 
	{
		System.out.printf("%s 주차 합니다.\n", str_name);
	}
	
	public void 전진(String str_name)
	{
		System.out.printf("%s 전진 합니다.\n", str_name);
	}
	
	public void 후진(String str_name)
	{
		System.out.printf("%s 후진 합니다.\n", str_name);
	}
	
	public void 정지(String str_name)
	{
		System.out.printf("%s 정지 합니다.\n", str_name);
	}
	
	public void 좌회전(String str_name)
	{
		System.out.printf("%s 좌회전 합니다.\n", str_name);
	}
	
	public void 우회전(String str_name)
	{
		System.out.printf("%s 우회전 합니다.\n", str_name);
	}
	
	//===================================================
	public String 이름 = "자동차";
	
	public void 주차() 
	{
		System.out.printf("%s 주차 합니다.\n", 이름);
	}
	
	public void 전진() // 전진() method 선언문
	{
		System.out.printf("%s 전진 합니다.\n", 이름);
	}
	
	public void 후진()
	{
		System.out.printf("%s 후진 합니다.\n", 이름);
	}
	
	public void 정지()
	{
		System.out.printf("%s 정지 합니다.\n", 이름);
	}
	
	public void 좌회전()
	{
		// Left
		System.out.printf("%s 좌회전 합니다.\n", 이름);
	}
	
	public void 우회전()
	{
		// Right
		System.out.printf("%s 우회전 합니다.\n", 이름);
	}
	
}
