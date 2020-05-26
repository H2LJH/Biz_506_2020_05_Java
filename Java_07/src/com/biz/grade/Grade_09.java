package com.biz.grade;

import java.util.Random;

public class Grade_09 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		int[] iArr_KorScore = new int[100];
		int iSum = 0;
		int iAvg = 0;
		int num_1 = 0;
		int num_2 = 0;
	
		for(int i = 0; i<=iArr_KorScore.length-1; i++)
		{
			// num_i 라는 변수가 존재하지 않으므로 사용 불가능
			// num_i = 90;
			iArr_KorScore[i] = rnd.nextInt(50)+51;
			iSum += iArr_KorScore[i];
			System.out.println((i+1) + " 번째 점수 : " + iArr_KorScore[i]);
		}
		iAvg = iSum/100;
		System.out.println("총점 : " + iSum);
		System.out.println("평균 : " + iAvg);
		
	}
}
