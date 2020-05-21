package com.biz.hello;

public class Var_11 
{
	public static void main(String[] args)
	{
		int num1 = 1;
			num1 = num1 + 1;
			num1 += 1; // num1 += 1은 (num1 + num1 += 1)이다.
			
			// 추가되는 값이 일 경우는 아래와 같은 코드로 사용가능
			num1++;
			++num1;
			
		int num2 = 10;
			num2 = num2 + 12;
			num2 += 12;

	}
}
