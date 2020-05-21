package com.biz.hello;

public class VarGuGu_01 
{
	public static void main(String[] args)
	{
		int num1 = 7;
		int num2 = 0;
		
		for(int i=0; i<=8; ++i) 
			System.out.println((num1 + " * " + ++num2 + " = ") + (num1*num2));		
	}
}
