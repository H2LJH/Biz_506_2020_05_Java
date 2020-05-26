package com.biz.grade;

import java.util.Random;

public class Grade_11 
{
	public static void main(String[] agrs)
	{
		Random rnd = new Random();
		int[] iNum = new int[10];
		
		for(int i=0; i<=9; i++)
			iNum[i] = rnd.nextInt(100)+1;
		
		for(int i=0; i<=9; i++)
		{
			if(iNum[i] % 2 == 0)
				System.out.println(i + "번째 배열의 숫자는 짝수 : " + iNum[i]);
		}
		
	}
}
