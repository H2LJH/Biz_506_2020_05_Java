package com.biz.hello;

public class Var_14 
{
	public static void main(String[] args)
	{
		// float = 실수형 변수, 소수점이하 7자리까지 표현 가능
		float num1 = 10.0f;
		float num2 =  3.0f;
		System.out.println(num1 / num2);
		
		// double = 실수형 변수, 소수점 17자리까지 표현 가능
		double num3 = 10.0;
		double num4 =  3.0;
		System.out.println(num3 / num4); 
		
		// int(integer) = 정수형 변수, 2의31승 +- 범위의 정수 취급, (32bit, 4byte)
		int num5 = 1000_000_000;
		int num6 = 300;		
		System.out.println(num5 * num6); // overflow
		
		
		// long = 정수형 변수, 2의63승 +- 범위의 정수 취급 (64bit 크기의 값 가능)
		long num7 = 1000_000_000_000_000L;
		long num8 = 3000L;
		System.out.println(num7 * num8);
	}
}
