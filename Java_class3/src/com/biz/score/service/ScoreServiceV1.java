package com.biz.score.service;

import com.biz.score.vo.ScoreVO;

/*
 *   필드변수 선언이유
 *   1. method들의 매개변수 줄이기 위해서
 *   2. 다른 코드의 의해 scores 배열값이 변형되는것을 방지하는 목적도 있다.
 */


public class ScoreServiceV1 
{
	private ScoreVO[] scoreList; 
	
	public void setScoreList(ScoreVO[] scoreList) 
	{
		this.scoreList = scoreList;
	}
	
	public int totalSum()
	{
		int total_sum = 0;
		for(int i=0; i<scoreList.length; ++i)
			total_sum += scoreList[i].getKor();
			
		return total_sum;
	}
	
	public void scoreSum()
	{
		for(int i=0; i<scoreList.length; ++i)
			scoreList[i].setSum(scoreList[i].getEng()  + scoreList[i].getKor()+
						  		scoreList[i].getMath() + scoreList[i].getMusic());	
	}
	
	public int korSum()
	{
		int kor_Sum = 0;
		for(int i=0; i<scoreList.length; ++i)
			kor_Sum += scoreList[i].getKor();
			
		return kor_Sum;
	}
	
	public int engSum()
	{
		int eng_Sum = 0;
		for(int i=0; i<scoreList.length; ++i)
			eng_Sum += scoreList[i].getEng();
			
		return eng_Sum;
	}
	
	public int mathSum()
	{
		int math_sum = 0;
		for(int i=0; i<scoreList.length; ++i)
			math_sum += scoreList[i].getMath();
			
		return math_sum;
	}
	
	public int musicSum()
	{
		int music_sum = 0;
		for(int i=0; i<scoreList.length; ++i)
			music_sum += scoreList[i].getMusic();
			
		return music_sum;
	}
	
	public void scoreAvg(int avg)
	{
		for(int i=0; i<scoreList.length; ++i)
			scoreList[i].setAvg(scoreList[i].getSum() / avg);
	}
	
	public void scoreList(int avg, int total_man)
	{

		System.out.println("--------------------------------------------------------");
		System.out.println("이름\t 국어\t 영어\t 수학\t 음악\t 총점\t 평균");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<scoreList.length; ++i)
		{
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\n", scoreList[i].getNum(),   scoreList[i].getKor(),
																	scoreList[i].getEng(),   scoreList[i].getMath(),
																	scoreList[i].getMusic(), scoreList[i].getSum(),
																	scoreList[i].getAvg());
			System.out.println("--------------------------------------------------------");
		}
		
		System.out.printf("총점 :\t %d\t %d\t %d\t %d\t\n",korSum(), engSum(), mathSum(), musicSum(), totalSum());
		System.out.printf("평균 :\t %d\t %d\t %d\t %d\t\n",(korSum() / total_man),  (engSum() / total_man),
														   (mathSum() / total_man), (musicSum() / total_man)); 
														   			
		
	}		
}


