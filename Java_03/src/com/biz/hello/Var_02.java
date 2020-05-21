package com.biz.hello;

import java.util.Random;

public class Var_02 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		
		int    num1 = rnd.nextInt(100) + 1, 
			   num2 = rnd.nextInt(100) + 1;
		
		System.out.println("num1 값은 : " + num1);
		System.out.println("num2 값은 : " + num2);
		
		if((num1+num2) % 2 == 0) System.out.println("덧셈 결과 짝수");
		else 					 System.out.println("덧셈 결과 짝수 아님");

		if((num1-num2) % 2 == 0) System.out.println("뺄셈 결과 짝수");
		else 					 System.out.println("뺄셈 결과 짝수 아님");
			
		if((num1*num2) % 2 == 0) System.out.println("곱셈 결과 짝수");
		else 					 System.out.println("곱셈 결과 짝수 아님");

		if((num1/num2) % 2 == 0) System.out.println("나눗셈 결과 짝수");
		else 					 System.out.println("나눗셈 결과 짝수 아님");
	}
}
