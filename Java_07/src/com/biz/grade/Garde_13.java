package com.biz.grade;

import java.util.Random;

public class Garde_13 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		int[] Arr_num = new int[100];
		int iSum = 0;
		
		for(int i=0; i<=99; ++i)
			Arr_num[i] = rnd.nextInt(100)+1;
		
		for(int i=0; i<=99; ++i)
		{
			if((Arr_num[i] % 3 == 0) || (Arr_num[i] % 5 == 0))
				iSum += Arr_num[i];
		}
		System.out.println("3 또는 5의 배수들 합 : " + iSum);
	}
}
