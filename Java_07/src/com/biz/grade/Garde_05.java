package com.biz.grade;

import java.util.Random;

public class Garde_05 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
	/*	
		int iNum_1;
		int iNum_2;
		int iNum_3;
		int iNum_4;
		int iNum_5;
		int iNum_6;
		int iNum_7;
		int iNum_8;
		int iNum_9;
		int iNum_10;
		
		iNum_1 = rnd.nextInt(50)+51;
		iNum_2 = rnd.nextInt(50)+51;
		iNum_3 = rnd.nextInt(50)+51;
		iNum_4 = rnd.nextInt(50)+51;
		iNum_5 = rnd.nextInt(50)+51;
		iNum_6 = rnd.nextInt(50)+51;
		iNum_7 = rnd.nextInt(50)+51;
		iNum_8 = rnd.nextInt(50)+51;
		iNum_9 = rnd.nextInt(50)+51;
		iNum_10 = rnd.nextInt(50)+51;
		
		System.out.println("1 국어 점수 : " + iNum_1);
		System.out.println("2 국어 점수 : " + iNum_2);
		System.out.println("3 국어 점수 : " + iNum_3);
		
		System.out.println("4 국어 점수 : " + iNum_4);
		System.out.println("5 국어 점수 : " + iNum_5);
		System.out.println("6 국어 점수 : " + iNum_6);
		
		System.out.println("7 국어 점수 : " + iNum_7);
		System.out.println("8 국어 점수 : " + iNum_8);
		System.out.println("9 국어 점수 : " + iNum_9);
		System.out.println("10 국어 점수 : " + iNum_10);
		
		int iSum = iNum_1+iNum_2+iNum_3+iNum_4+iNum_5+iNum_6+iNum_7+iNum_8+iNum_9+iNum_10;
		int iAvg = iSum/10;
		
		System.out.println("평균  : " + iSum);
		System.out.println("국어 점수 : " + iAvg);
		*/
		int[] a = new int[10];
		int sum = 0;
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i] += rnd.nextInt(50)+51;
			System.out.println((i+1) + "번 국어 점수 : " + a[i]);			
			sum += a[i];
		}
		//int Avg = sum / 10;
	}
}
