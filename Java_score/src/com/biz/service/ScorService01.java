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
		
		try 
		{			
			System.out.print("학번 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setNumber(intN);

			System.out.print("국어 점수 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setKor(intN);
			
			System.out.print("영어 점수 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setEng(intN);
			
			System.out.print("수학 점수 입력 :");
			strN = sc.nextLine();
			intN = Integer.valueOf(strN);
			vo.setMath(intN);
			
		} 
		catch (Exception e)
		{
			intN = -1;
			System.out.println("입력 값이 잘못된 항목은 -1로 표시합니다.");
			vo.setNumber(intN);
			vo.setKor(intN);
			vo.setEng(intN);
			vo.setMath(intN);
		}
		
		intN = vo.getKor() + vo.getEng() + vo.getMath();
		vo.setSum(intN);
		vo.setAvg(intN / 3);
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
