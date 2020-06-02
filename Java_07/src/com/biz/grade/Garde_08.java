package com.biz.grade;

import java.util.Random;

public class Garde_08 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		int[] iArr_Kor = new int[10];
		
		iArr_Kor[0] = rnd.nextInt(50)+50;
		iArr_Kor[1] = rnd.nextInt(50)+50;
		iArr_Kor[2] = rnd.nextInt(50)+50;
		
		iArr_Kor[3] = rnd.nextInt(50)+50;
		iArr_Kor[4] = rnd.nextInt(50)+50;
		iArr_Kor[5] = rnd.nextInt(50)+50;
		
		iArr_Kor[6] = rnd.nextInt(50)+50;
		iArr_Kor[7] = rnd.nextInt(50)+50;
		iArr_Kor[8] = rnd.nextInt(50)+50;
		iArr_Kor[9] = rnd.nextInt(50)+50;
		iArr_Kor[10] = rnd.nextInt(50)+50; // 익셉션 오류
		
	}
}
