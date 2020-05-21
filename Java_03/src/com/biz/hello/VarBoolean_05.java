package com.biz.hello;

import java.util.Random;

public class VarBoolean_05 
{
	public static void main(String[] args) 
	{
		Random  rnd  = new Random();
		int 	num1 = rnd.nextInt(100);
		Boolean bVar = (num1 % 2) == 0;
		
		if(bVar == true) 
			System.out.println(num1 + "은 짝수");
		
		if(bVar == false) 
			System.out.println(num1 + "은 짝수 아님");
	}
}
