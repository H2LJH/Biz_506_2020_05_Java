package com.biz.grade;

import java.util.Random;

public class Grade_02 
{
	public static void main(String[] args) 
	{
		// 어떠한 변수를 선언만 하면 그 변수는 사용을 바로 할수없다.
		// 모든 변수는 선언을 하고 초기화를 수행해야 한다.
		// 클래스, 클래스로만든 변수, 생성 코드
		Random rnd = new Random();
		
		// String도 실제로는 클래스 라고 한다.
		String strName = "홍길동";
		
		// String 변수도 원래는 new String() 초기화 코드를 사용하여 변수를 생성해줘야 한다.
		// 다만 String class는 워낙 사용용도가 많으므로 굳이 생성 하지 않아도 되도록 만들어져 있다. 
		String strNation = new String();
		
		int iSum = 0;
		for(int i = 0; i <= 9; ++i)
		{
			int iNum = rnd.nextInt(100);
			iSum += iNum;
		}
		System.out.println(iSum);
		
	}
}
