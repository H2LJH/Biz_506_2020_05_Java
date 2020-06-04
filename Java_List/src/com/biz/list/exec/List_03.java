package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_03 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		List<Integer> int1 = new ArrayList<Integer>(); 
		int count = 0;
		
		for(int i=0; i<100; i++)
			int1.add(rnd.nextInt(100)+1); 
		
		for(int i=0; i<100; i++)
		{
			if(int1.get(i) % 2 == 0)
			{
				count++;
				System.out.printf("%d\t",int1.get(i));
				
				if(count % 5 == 0)
					System.out.println();
			}
		}
		
		System.out.println("\n짝수 개수 : " + count); // 짝수 개수 출력
	}
}
