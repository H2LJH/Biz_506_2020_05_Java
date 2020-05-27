package com.biz.grade;

//1~100의 숫자중에서 짝수,3의배수 구하기

public class Array_03 
{
	public static void main(String[] args) 
	{
		int sc_2 = 0;
		int sc_3 = 0;
		
		for(int i=1; i<=100; ++i)
		{
			if(i % 2 == 0)
				sc_2++;
			
			if(i % 3 == 0)
				sc_3++;
		}
		System.out.println("짝수는 몇개 ? : " + sc_2);
		System.out.println("3의 배수 몇개 ? : " + sc_3);
		
		
	}
}
