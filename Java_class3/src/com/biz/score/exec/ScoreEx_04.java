package com.biz.score.exec;

import java.util.ArrayList;
import java.util.List;

public class ScoreEx_04 
{
	public static void main(String[] args) 
	{
		List<String> str1 = new ArrayList<String>();
		
		str1.add("대한민국");
		str1.add("우리나라");
		str1.add("Korea");
		
		String s1 = str1.get(0);
		String s2 = str1.get(1);
		String s3 = str1.get(2);
		
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(900);
		int num1 = nums.get(0);
		System.out.println(num1);
		System.out.println(nums.get(0));
		
	}
}
