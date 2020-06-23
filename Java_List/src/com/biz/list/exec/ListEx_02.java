package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 
{
	public static void main(String[] args) 
	{
		List<Integer> intList = new ArrayList<>();
		Random rnd = new Random();
		
		for(int i=0; i<100; ++i)
		{
			int num = rnd.nextInt(100)+1;
			intList.add(num);
		}
		
		int sum = 0;
		for(int i=0; i<100; ++i)
		{
			sum += intList.get(i);
		}
		
		System.out.println(sum);
		
	}
}
