package com.biz.hello;

public class VarString_03 
{
	public static void main(String[] args)
	{
		// 문자열형 이외의 형 연산 수행시 문자열로 형변환 하여 연결연산을 수행한다.
		int    num1 = 30;
		String str1 = "나이 : ";
		String sum  = str1+num1;
		System.out.println(sum);
		
		float num2 = 30.2f;
		sum = num2+ str1;
		System.out.println(sum);
		
		System.out.println((3+"+"+5+"=")+(3+5));
	}
}