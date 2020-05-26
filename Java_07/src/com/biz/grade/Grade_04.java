package com.biz.grade;

import java.util.Random;

public class Grade_04 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		
		float FKor;
		float FEng;
		float FMath;
		float FSum;
		float FAvg;
		
		FKor  = rnd.nextInt(50)+51;
		FEng  = rnd.nextInt(50)+51;
		FMath = rnd.nextInt(50)+51;
		
		FSum = FKor + FEng + FMath;
		FAvg = FSum / 3; 
		
		System.out.println("총점 : " + FSum);
		System.out.println("평균 : " + FAvg);
	}
}
