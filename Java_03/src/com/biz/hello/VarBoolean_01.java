package com.biz.hello;



public class VarBoolean_01 
{
	public static void main(String[] args)
	{
		int num1 = 2;
		boolean bvar1 = (num1 % 2) == 0;
		if(bvar1 == true)  System.out.println(num1 + "는 짝수 입니다.");
		if(bvar1 == false) System.out.println(num1 + "는 짝수가 아닙니다.");
	}
}
