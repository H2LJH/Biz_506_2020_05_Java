package com.biz.grade;

import java.util.Random;

public class Array_01 
{
	public static void main(String[] args) 
	{
		// 20명 국어,영어,수학.음악 점수 구하기
		// 점수는 51~100점
		// 학생별 점수 총점, 평균
		// 과목별 점수 총점, 평균
		Random rnd = new Random();
		int iTotal_man = 20;
		int iTotal_class = 4;
		int iSum   = 0;
		int iAvg   = 0;
		int ITKor  = 0;
		int ITEng  = 0;
		int ITMath  = 0;
		int ITMusic  = 0;
		int[] arr_man   = new int[iTotal_man];
		int[] arr_Kor   = new int[iTotal_man];
		int[] arr_Eng   = new int[iTotal_man];
		int[] arr_Math  = new int[iTotal_man];
		int[] arr_Music = new int[iTotal_man];
		
		
		for(int i=0; i<iTotal_man; i++)
		{
			arr_Kor[i]   = rnd.nextInt(50)+51;
			arr_Eng[i]   = rnd.nextInt(50)+51;  
			arr_Math[i]  = rnd.nextInt(50)+51;
			arr_Music[i] = rnd.nextInt(50)+51;
		}
		
		for(int i=0; i<iTotal_man; i++)
		{
			iSum = arr_Kor[i] + arr_Eng[i] + arr_Math[i] + arr_Music[i];
			arr_man[i] = iSum;
			ITKor   += arr_Kor[i];
			ITEng   += arr_Eng[i];
			ITMath  += arr_Math[i];
			ITMusic += arr_Music[i];
		}
		
		for(int i=0; i<iTotal_man; i++)
		{
			iAvg = arr_man[i] / iTotal_class;
			System.out.println((i+1) + " 번 학생 국어 점수 : " + arr_Kor[i]);
			System.out.println((i+1) + " 번 학생 영어 점수 : " + arr_Eng[i]);
			System.out.println((i+1) + " 번 학생 수학 점수 : " + arr_Math[i]);
			System.out.println((i+1) + " 번 학생 음악 점수 : " + arr_Music[i]);
			System.out.println((i+1) + " 번 학생 점수 총점 : " + arr_man[i]);
			System.out.println((i+1) + " 번 학생 점수 평균 : " + iAvg);
			System.out.println("====================================");

			if(i == iTotal_man-1)
			{
				iAvg = ITKor / iTotal_man-1;
				System.out.println("모든 학생 국어 총점 : " + ITKor);
				System.out.println("모든 학생 국어 평균 : " + iAvg);
				System.out.println("====================================");				
				
				iAvg = ITEng / iTotal_man-1;
				System.out.println("모든 학생 영어 총점 : " + ITEng);
				System.out.println("모든 학생 영어 평균 : " + iAvg);
								
				iAvg = ITMath / iTotal_man-1;
				System.out.println("====================================");
				System.out.println("모든 학생 수학 총점 : " + ITMath);
				System.out.println("모든 학생 수학 평균 : " + iAvg);
				
				iAvg = ITMusic / iTotal_man-1;
				System.out.println("====================================");
				System.out.println("모든 학생 음악 총점 : " + ITMusic);
				System.out.println("모든 학생 음악 평균 : " + iAvg);
			}
		}
	
		
	}
}
