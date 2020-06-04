package com.biz.list.service;

import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreServiceV2 
{
	List<ScoreVO> scorelist;
	
	public int stSum(List<ScoreVO> scorelist)
	{
		int sum = 0;
		for(int i=0; i<scorelist.size(); ++i)
			sum = scorelist.get(i).getKor() + 
				  scorelist.get(i).getEng() +
				  scorelist.get(i).getMath();
		return sum;
	}
	
	public int stAvg()
	{
		int avg = 0;
		for(int i=0; i<scorelist.size(); ++i)
			avg = scorelist.get(i).getStSum() / 3;
	
		return avg;
	}
	
	public void scoreList()
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<scorelist.size(); ++i)
		{
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\n", scorelist.get(i).getNum(),   scorelist.get(i).getKor(),
																	scorelist.get(i).getEng(),   scorelist.get(i).getMath(), 
																	scorelist.get(i).getStSum(), scorelist.get(i).getStAvg());
			System.out.println("--------------------------------------------------------");
		}
	}
}


