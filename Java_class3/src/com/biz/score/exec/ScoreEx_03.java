package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.score.vo.ScoreVO;

public class ScoreEx_03 
{
	public static void main(String[] args) 
	{
		// Array List는 배열의 크기를 지정하지 않아도 된다.
		// 명칭 : List type 객체(인스턴스) || str1 List 
		
		// Generic : <type> type의 데이터를 포함 
		List<Integer> 	int1  = new ArrayList<Integer>(); // java 1.8 이전 방식
		List<String>  	str1  = new ArrayList<>();	      //  "   1.8 이상 Generic 생략가능
		List<Character> char1 = new ArrayList<>();
		List<Boolean> 	b1 = new ArrayList<>();
		List<Float>	  	f1 = new ArrayList<>();
		List<Double>  	d1 = new ArrayList<>();
		List<Long>  	l1 = new ArrayList<>();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		List<Random>  rndList   = new ArrayList<Random>();
		
		//add() method를 호출하여 매개변수로 전달하면 List가 size가 늘어남.
		str1.add("대한민국");
		str1.add("우리나라");
		str1.add("Reupublic of Korea");
		str1.add(""+90);

		int1.add(10);
		int1.add(20);
		int1.add(30);
		
		char1.add('A');
		char1.add('나');
		char1.add('3');
		
	}
	
}
