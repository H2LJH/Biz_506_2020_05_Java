package com.biz.grade;

import java.util.Random;

public class Grade_10 {
	public static void main(String[] args) 
 {	
	Random rnd    = new Random();
	int iTotal    = 10;
	int isum_Kor  = 0;
	int isum_Eng  = 0;
	int isum_Math = 0;
	int iAvg 	  = 0;
	int[] iArr_Kor  = new int[iTotal];
	int[] iArr_Eng  = new int[iTotal];
	int[] iArr_Math = new int[iTotal];

	for(int i = 0; i<=iTotal-1; i++)
	{
		iArr_Kor[i]  += rnd.nextInt(50)+51;
		iArr_Eng[i]  += rnd.nextInt(50)+51;
		iArr_Math[i] += rnd.nextInt(50)+51;
	}
	
	for(int i = 0; i<=iTotal-1; i++)
	{					
		isum_Kor  += iArr_Kor[i];
		isum_Eng  += iArr_Kor[i];
		isum_Math += iArr_Kor[i];
	}
	
	for(int i = 0; i<=iTotal-1; i++)
	{
		System.out.println((i+1) + "번 국어 점수 : " + iArr_Kor[i]);
		System.out.println((i+1) + "번 영어 점수 : " + iArr_Eng[i]);
		System.out.println((i+1) + "번 수학 점수 : " + iArr_Math[i]);
		System.out.println("==============================");
	}
	
	iAvg = isum_Kor / 10;
	System.out.println("국어 총점 : " + isum_Kor);
	System.out.println("국어 평균 : " + iAvg);
	
	System.out.println("===============================");
	iAvg = isum_Eng / 10;
	System.out.println("영어 총점 : " + isum_Eng);
	System.out.println("영어 평균 : " + iAvg);
	
	System.out.println("===============================");
	iAvg = isum_Math / 10;
	System.out.println("수학 총점 : " + isum_Math);
	System.out.println("수학 평균 : " + iAvg);
	}
}
