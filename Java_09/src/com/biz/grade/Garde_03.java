package com.biz.grade;

import java.util.Random;

// 1. 정수형 변수 2개 선언 
// 2. 정수형 변수(1)에 임의 값*55 할당
// 3. 정수현 변수(2)에 졍수형 변수(1) 값 할당
// 4. 최종 결과값 Console에 출력

public class Garde_03 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		int num = rnd.nextInt();
		num*=55;
		int sum = num;
		System.out.println(sum);
	}
}
