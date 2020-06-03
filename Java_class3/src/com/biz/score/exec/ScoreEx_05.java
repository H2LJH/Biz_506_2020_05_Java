package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScoreEx_05 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		
		List<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 0; i < 100; i++)
			nums.add(rnd.nextInt(50)+51);
		
		for(int i = 0; i < 100; i++)
		{
			System.out.printf("%d ",nums.get(i));
			if(i % 5 == 0)
			System.out.println();
		}
		
	}
}
