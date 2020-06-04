package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class List_05 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		List<Integer> intList = new ArrayList<Integer>();
		
		int total = 100;
		Boolean bfirst = false;
		
		for(int i=0; i<total; i++)
			intList.add(rnd.nextInt(100)+1);
		
		for(int i=0; i<total; i++)
		{
			int num = intList.get(i);
			if(intList.get(i) == 55 && bfirst == false)
			{
				bfirst = true;
				System.out.println("List print : " + num);
				System.out.println("first List index : " + i);
			}
			
		}

	}
}
