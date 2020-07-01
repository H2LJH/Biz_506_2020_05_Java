package com.biz.addr.exec;

public class Number_ex 
{
	public static void main(String[] args) 
	{
		// 숫자형 문자열을 정수로 변환시키는 method
		// java 1.6 이상에서는 내부 매커니즘이 같아져 parserXXXX()과 성능차이가 없다.
		Integer.valueOf("34"); 
		Float.valueOf("34.3");
		Double.valueOf("33.3");
		Long.valueOf("333333");
		
		
		// Java 1.5 이전 숫자형 문자열을 정수로 변환시키는 method 
		Integer.parseInt("34");
		Float.parseFloat("34.3");
		Double.parseDouble("33.3");
		Long.parseLong("3333");
		
		
		// NumberofFormatException을 일으키는 코드
		Integer.valueOf(""); 
		Integer.valueOf("11 "); // 숫자 앞, 뒤에 white space 문제
		Integer.valueOf("a34"); // 숫자 앞, 뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3 4"); // 숫자 중간에 공백, 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3+4"); // 하나의 문자열이 연산식 처럼 보일때
	}
}
