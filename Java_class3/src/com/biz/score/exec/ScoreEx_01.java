package com.biz.score.exec;

import java.util.Random;

import com.biz.score.service.ScoreServiceV1;
import com.biz.score.vo.ScoreVO;

public class ScoreEx_01 
{
	public static void main(String[] args) 
	{
		
		Random rnd = new Random();
	
		int total_man = 10;  // 총 사람 수
		int total_class = 4; // 과목수
		ScoreVO[] score_VO = new ScoreVO[total_man];
		
		for(int i=0; i<total_man; ++i)
			score_VO[i] = new ScoreVO();
	
		for(int i=0; i<total_man; ++i)
		{	
			score_VO[i].setNum(""+(i+1));
			score_VO[i].setKor(rnd.nextInt(50)+51);
			score_VO[i].setEng(rnd.nextInt(50)+51);
			score_VO[i].setMath(rnd.nextInt(50)+51);
			score_VO[i].setMusic(rnd.nextInt(50)+51);
		}
		
		ScoreServiceV1 scoreServiceV1 = new ScoreServiceV1();
		scoreServiceV1.setScoreList(score_VO);
		scoreServiceV1.scoreSum();
		scoreServiceV1.scoreAvg(total_class);
		scoreServiceV1.scoreList(total_class,total_man);
		
	}
}
