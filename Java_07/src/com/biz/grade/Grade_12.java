package com.biz.grade;
import java.util.Random;

public class Grade_12 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		int[] Arr_num = new int[10];
		int iSum = 0;
		
		for(int i=0; i<=9; ++i)
			Arr_num[i] = rnd.nextInt(50)+51;
		
		for(int i=0; i<=9; ++i)
		{
			if(Arr_num[i] % 2 == 0)
				iSum += Arr_num[i];
		}
		System.out.println("배열의 짝수들 합 : " + iSum);
	}
}
