package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 
{
	List<ScoreVO> scoreList;

	public void stSum(List<ScoreVO> scoreList)
	{
		this.scoreList = scoreList;
		int scoreSize = scoreList.size();
		for(int i=0; i<scoreSize; ++i)
		{
			ScoreVO sVO = scoreList.get(i);
			int sum = sVO.getKor() + sVO.getEng() + sVO.getMath();
			sVO.setStSum(sum); 
		}
	
	}
	
	public void stAvg()
	{
		int scoreSize = scoreList.size();
		for(int i=0; i<scoreSize; ++i)
		 {
			ScoreVO sVO = scoreList.get(i);
			sVO.setStAvg(sVO.getStSum() / 3);
		 }

	}
	
	public void scoreList()
	{
		int scoreSize = scoreList.size();
		
		System.out.println("=============================================");
		System.out.println("\t\t성적 리스트");
		System.out.println("=============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=============================================");
		for(int i=0; i<scoreSize; i++)
		{
			ScoreVO sVO = scoreList.get(i);
			System.out.print(sVO.getNum() + "\t");
			System.out.print(sVO.getKor() + "\t");
			System.out.print(sVO.getEng() + "\t");
			System.out.print(sVO.getMath() + "\t");
			System.out.print(sVO.getStSum() + "\t");
			System.out.print(sVO.getStAvg() + "\t\n");
			System.out.println("=============================================");
		}
	}
}


