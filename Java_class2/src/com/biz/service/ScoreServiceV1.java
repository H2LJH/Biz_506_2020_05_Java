package com.biz.service;

import com.biz.model.ScoreV0;

public class ScoreServiceV1
{
	public void sum(ScoreV0[] score)
	{
		for(int i=0; i<score.length; ++i)
		score[i].setSum(score[i].getEng()+score[i].getKor()+score[i].getMath());
	}
	
	public void avg(ScoreV0[] score)
	{
		for(int i=0; i<score.length; ++i)
			score[i].setAvg(score[i].getSum() / 3);
	}
	
	public void scoreList(ScoreV0[] score)
	{
		sum(score);
		avg(score);
		
		System.out.println("========================================================");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<score.length; ++i)
		{
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\n", score[i].getName(),score[i].getKor(),
															 score[i].getEng(),score[i].getMath(),
															 score[i].getSum(),score[i].getAvg());
			System.out.println("--------------------------------------------------------");
		}
	}
	
}
