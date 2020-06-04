package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class List_04 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		
		int total = 100;
		
		for(int i=0; i<total; i++)
			intList.add(rnd.nextInt(100)+1);
		
		for(int i=0; i<total; i++)
		{
			if(intList.get(i) == 55)
				System.out.println("출력");
		}

	}
}
