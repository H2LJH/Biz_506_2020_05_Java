package com.biz.hello;

public class VarString_04 
{
	public static void main(String[] args)
	{
		char char1 = 'A'; // 문자, character형
		System.out.println(char1);
		
		int   num1 = 0;    // 정수형 변수를 선언하고 초기화(clear)한다.
		float num2 = 0.0f; // 실수형 변수를 선언하고 초기화(clear)한다.
			  num1 = 10;
			  num2 = 10.0f;
	   System.out.println(num1+num2); // 정수형+실수형 사칙연산을 수행하면 정수값을 실수형으로 변경하고 실수+실수로 연산한다.
	   
	    /*
	             실수값을 정수형 변수에 할당 한다면 컴파일러 오류가 난다.
	             이유는 실수값을 정수형 변수에 할당한다면 소수점 이하 값을 잘라버린다.
	             따라서 오차가 발생하거나 결과에 문제가 생길 것 이라고 판단한다.
	     */
	   num1 = (int)(30.0 + 40.0); 
	   num2 = 30 + 40;            // num2 = float, 실수값으로 출력 
	   
	   String str1 = 30 + "A";    // 숫자+문자열, 문자열+숫자 연산 이후에 저장하면 저장이 가능하다.
	   
	   float num3 = 30;    		  // type convert, type cast(정수를 실수 30.0으로 변환후 num3 저장)
	   int 	 num4 = (int)30.0f;   // 강제(명시적) 형변환 
	}		
}
