package com.biz.control;

public class if_01 
{
	public static void main(String[] args)
	{
		// if 명령문을 사용할때 boolean형 변수를 만들어서 연산결과를 변수에 담고 변수의 true, false 판단하여 
		// 어떤처리를 하는 경우 보다는 직접 if()명령문에 연산식을 집어넣어 처리하는 경우가 더 많다.

		Boolean bVar = true;
				
		if(bVar == true) 
			System.out.println("bVar 는 true");

		bVar = (32 % 2) == 0;	
		if((32 % 2) == 0)
			System.out.println("32는 짝수");
	}
}
