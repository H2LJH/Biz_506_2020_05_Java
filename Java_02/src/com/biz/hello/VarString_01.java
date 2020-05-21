package com.biz.hello;

public class VarString_01 
{
	public static void main(String[] args) // 시작점, 진입점  Method
	{
		int    num1  = 10; 		 // integer, 정수형 변수
		char   char1 = 'A'; 	 // 문자형, character형 변수, ''(SQ)
		char   char2 = '가';     // 영어,공백 1byte 이외 2byte 
		
		String str1  = "대한민국"; // 문자열형, String형, class형 키워드, ""(DQ)	
		System.out.println(str1);
		
		String str2 = "은 우리나라";
		System.out.println(str1+str2); // 문자열의 plus(+) 연산, java는 문자열을 덧셈연산(연결) 할 수 있다.
		//System.out.println(str1-str2); // 문자열은 plus(+) 연산만을 수행할수 있다.
	}
}


