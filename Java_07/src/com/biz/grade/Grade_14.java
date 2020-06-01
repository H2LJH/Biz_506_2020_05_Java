package com.biz.grade;

import java.util.Random;

public class Grade_14 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		int[] iNums = new int[6];
		
		for(int i=0; i<=5; i++)
		{
			int iNum  = rnd.nextInt(45)+1;
			int index = 0;
			
			for(index=0; index<=5; ++index)
			{
				if(iNums[index] == iNum) break;
			}
			
			if(index == 6)
				iNums[i] = iNum;
		}
		
		for(int i=0; i<=5; ++i)
		{
			System.err.println(iNums[i]);
		}
		
	}
}
