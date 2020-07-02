package com.biz.score;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImplV1;

public class ScoreEx_01 
{
	public static void main(String[] args) 
	{
		// interface를 implemnets하여 만들어진 클래스는
		// 선언을 할때는 interface로 선언을 하고,
		// 초기화 할때는 실제 코드가 구현된 클래스로 초기화 한다.
		ScoreService sService = new ScoreServiceImplV1();
		
		
		/*
		 *  List interface는 ArrayList 클래스를 선언할때 implements한 주체이다.
		 *  따라서 ArrayList형 객체(인스턴스)를 만들때는
		 *  선언은 List로 하고, 초기화는 ArrayList로 수행한다.
		 */
		List<String> strList = new ArrayList<String>();
		strList = new LinkedList<String>();
		strList = new Vector<String>();
		
		sService.inputScore();
		sService.calcSum();
		sService.calcAvg();
		sService.scoreList();
	}
}
