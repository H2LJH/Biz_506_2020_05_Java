package com.biz.exec;

import com.biz.service.ScorService01;

public class ScoreEx_01 
{
	public static void main(String[] args) 
	{
		ScorService01 scoreService = new ScorService01();

		scoreService.inputScore();
		scoreService.scoreList();
		
	}
}
