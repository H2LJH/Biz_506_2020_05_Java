package com.biz.student.string;

public class StringEx_03 
{
	public static void main(String[] args) 
	{
		String strNation = "Republic of Korea";
		String[] strNations;
		
		// ===============================================================
		strNations = strNation.split("");
		for(String s : strNations)
		{
			System.out.println(s + "\t");
		}
		// ===============================================================
		strNations = strNation.split(" ");		
		for(String s : strNations)
		{
			System.out.print(s + "\t\n\n");
		}
		// ===============================================================
		
		/*
		 *  단위(모듈) test라고 한다.
		 *  Score.csv파일을 읽어서 코드를 검증하고
		 *  모든 결과가 일치로 나타나는지 판단을 하는 것
		 *  
		 *  이떄 사용된 Score.csv 파일의 데이터를 testCase라고 한다.
		 */
		
		// ========================================================================
		String student = "00157:윤승준:4:1:컴퓨터공학:충청북도 단양군 단양읍중앙1로10";
		String[] students = student.split(":");
		
		System.out.println("학번 : " + students[0]);
		System.out.println("이름 : " + students[1]);
		System.out.println("학년 : " + students[2]);
		System.out.println("반 : " + students[3]);
		System.out.println("학과 : " + students[4]);
		System.out.println("주소 : " + students[5]);
		// ========================================================================
		
		System.out.println();
		String score = "1,86,67,72,225,75";
		String[] scores = score.split(",");
		System.out.println("학번 : " + scores[0]);
		System.out.println("국어 : " + scores[1]);
		System.out.println("영어 : " + scores[2]);
		System.out.println("수학 : " + scores[3]);
		System.out.println("총점 : " + scores[4]);
		System.out.println("평균 : " + scores[5]);
		
		int intKor = Integer.valueOf(scores[1]);
		int intEng = Integer.valueOf(scores[2]);
		int intMath = Integer.valueOf(scores[3]);
		int intSum = Integer.valueOf(scores[4]);
		int intAvg = Integer.valueOf(scores[5]);
		
		if(intSum == intKor + intEng + intMath)
		{
			System.out.println("계산결과 일치!!!");
		}
		
		else
		{
			System.out.println("계산결과 오류");
		}
		// ========================================================================
		
	}
}
