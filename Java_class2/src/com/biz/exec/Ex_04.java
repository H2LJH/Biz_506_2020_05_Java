package com.biz.exec;

import java.util.Random;

import com.biz.model.ScoreV0;
import com.biz.service.ScoreServiceV1;

public class Ex_04 
{
	public static void main(String[] args) 
	{
		int total = 20;
		ScoreV0[] score = new ScoreV0[total];
		Random rnd = new Random();
		
		for(int i=0; i<total; ++i)
			score[i] = new ScoreV0();
		
		for(int i=0; i<total; ++i)
		{
			score[i].setKor(rnd.nextInt(50)+51);
			score[i].setEng(rnd.nextInt(50)+51);
			score[i].setMath(rnd.nextInt(50)+51);
			score[i].setName(""+i);
		}
		ScoreServiceV1 scoreservice = new ScoreServiceV1();
		scoreservice.scoreList(score);
	}
}
