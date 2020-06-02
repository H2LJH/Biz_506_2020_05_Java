package com.biz.grade;

import java.util.Random;

// 100개 짜리 정수 배열 
// 1-100 임의의수 배열에 할당
// 한줄에 배열 인덱스의 값 5개씩 console에 표시

public class Array_06
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		int   sum = 0; 
		int[] num  = new int[100];
		int[] num2 = new int[100];
		
		for(int i=0; i<=99; ++i)
		{
			num[i] = rnd.nextInt(100)+1;
			sum += num[i];
			if((i+1) % 5 == 0)
			{
				num2[i] = sum;
				sum = 0;
			}
		}	
		
		for(int i=0; i<=99; ++i)
		{
			System.out.printf("%d\t", num[i]);
			
			if((i+1) % 5 == 0)
				System.out.printf("%d\n", num2[i]);
		}

	}
}
