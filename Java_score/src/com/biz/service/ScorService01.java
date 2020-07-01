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
		Scanner sc = new Scanner(System.in);
	}
	
	
	public boolean inputScore()
	{
		ScoreVO vo = new ScoreVO();
		int intN = 0;
		int sum = 0;
		String strN;
		
		System.out.print("학번 입력 :");
		strN = sc.nextLine();
		
		System.out.print("국어 점수 입력 :");
		strN = sc.nextLine();
		
		System.out.print("영어 점수 입력 :");
		strN = sc.nextLine();
		
		System.out.print("수학 점수 입력 :");
		strN = sc.nextLine();
		
		try 
		{				
			intN = Integer.valueOf(strN);
			vo.setKor(intN);
			sum += intN;
			
			intN = Integer.valueOf(strN);
			vo.setKor(intN);
			sum += intN;
			
			intN = Integer.valueOf(strN);
			vo.setEng(intN);
			sum += intN;
			
			intN = Integer.valueOf(strN);
			vo.setMath(intN);
			sum += intN;
			
		} 
		catch (Exception e)
		{
			System.out.println("입력값이 잘못 되었으므로 0점으로 처리 합니다.");
		}
		
		vo.setSum(intN);
		vo.setAvg(sum / 3);
			
		return true;
	}
	
	
	public void scoreList()
	{
		
		System.out.println("=============");
		System.out.println("주소록");
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
