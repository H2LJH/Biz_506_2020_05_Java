package com.biz.hello;

public class VarString_05 
{	
	public static void main(String[] args)
	{
		int   num1 = 0;
		float num2 = 0;
		
		num1 = (int)num2; // 강제형변환, 명시적 형변환
		num2 = num1; 	  // 자동형변환, 묵시적 형변환 
		
		// 아스키 코드
		num1 = 'A';
		System.out.println(num1);
		num1 = 'b';
		System.out.println(num1);
		num1 = 'C';
		System.out.println(num1);
		
		// 문자 'A'를 문자열로 변환 하고 문자열 "A"과 연결하여 str1에 저장
		// 문자'A'를 String에 바로 저장하지 못하는 것은
		// character 특성상 내부적으로 10진수 형식으로 저장되기 떄문이다.
		String str1 = 'A' + "A";
		System.out.println(str1);
		
		
		str1 = ('A' + 0) + "A";
		System.out.println(str1);
	}
}
