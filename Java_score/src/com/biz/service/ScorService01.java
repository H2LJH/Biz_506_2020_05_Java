package com.biz.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.biz.score.ScoreVO;

public class ScorService01 
{
	private ArrayList<ScoreVO> scoreList;
	private Scanner sc;
	
	public ScorService01()
	{
		scoreList = new ArrayList<ScoreVO>();
		sc = new Scanner(System.in);
	}
	
	
	public boolean inputScore()
	{
		ScoreVO vo = new ScoreVO();
		String strN = "";
		int intN = 0; 
		float sum = 0;
		 
		try 
		{			
			System.out.print("학번 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setNumber(intN);
		}
		catch(Exception e) 
		{
			System.out.println("잘못 입력");
			vo.setNumber(intN);
		}

		
		try 
		{
			System.out.print("국어 점수 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setKor(intN);
		}
		catch(Exception e)
		{
			System.out.println("잘못 입력");
			vo.setKor(intN);
		}
		
		
		try
		{
			System.out.print("영어 점수 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setEng(intN);
		}
		catch(Exception e)
		{
			System.out.println("잘못 입력");
			vo.setEng(intN);
		}
		
		
		try
		{
			
			System.out.print("수학 점수 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setMath(intN);
		}
		catch (Exception e)
		{
			System.out.println("잘못 입력");
			vo.setMath(intN);
		}
		
		sum = (float)(vo.getKor()) + (float)(vo.getEng()) + (float)(vo.getMath());
		vo.setSum(sum);
		vo.setAvg(sum / 3);
		scoreList.add(vo);
		return true;
	}
	
	
	public void scoreList()
	{
		
		System.out.println("=============");
		System.out.println("성적 정보");
		System.out.println("=============");
		System.out.println("학번\t 국어\t 수학\t 영어\t 총점\t 평균\t");
		for(int i=0; i<scoreList.size(); ++i)
		{
			ScoreVO vo = this.scoreList.get(i);
			System.out.print(vo.getNumber() + "\t" +
							 vo.getKor()    + "\t" + 
							 vo.getMath()   + "\t" + 
							 vo.getEng()    + "\t" + 
							 vo.getSum()    + "\t" + 
							 vo.getAvg()    + "\n");
			
		}
	}
	
	
}
