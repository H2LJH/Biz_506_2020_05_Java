package com.biz.grade;

import java.util.Random;

public class Grade_06 
{
	public static void main(String[] args) 
	{
	Random rnd = new Random();
	
	int[] iArray_Kor = new int[100];
	int iSum = 0;
	int iAvg = 0;
	
	for(int i = 0; i<=iArray_Kor.length-1; i++)
	{
		iArray_Kor[i] += rnd.nextInt(50)+51;
		System.out.println((i+1) + "번 국어 점수 : " + iArray_Kor[i]);
		iSum += iArray_Kor[i];
	}
	iAvg = iSum / 100;
	
	System.out.println("총점 국어 점수 : " + iSum);
	System.out.println("평균 국어 점수 : " + iAvg);
	}
}

