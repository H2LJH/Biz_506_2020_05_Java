package com.biz.grade;

import java.util.Random;

public class Grade_03 
{
	public static void main(String[] args) 
	{
		Random rnd   = new Random();
		
		int    iKor  = 0, 
			   iEng  = 0,
			   iMath = 0;
		
		iKor  = rnd.nextInt(100)+1;
		iEng  = rnd.nextInt(100)+1;
		iMath = rnd.nextInt(99)+2;
		
		int iSum = iKor + iEng + iMath;
		int iAvg = iSum / 3;
		
		System.out.println("총점 : " + iSum);
		System.out.println("평균 : " + iAvg);
	}
}
