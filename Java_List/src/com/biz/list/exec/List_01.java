/*
 *  com.biz.list 	  : 3단계 package, Base Package
 *  com.biz.list.exec : 4단계 package, 업무분류를 나타내는 package
 */

package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class List_01 
{
	public static void main(String[] args) 
	{
		Random rnd = new Random();
		List<Integer> int1 = new ArrayList<Integer>(); // 다른 class와 생성자의 이름이 다른 형태를 갖는다.
		int sum = 0;
		
		for(int i=0; i<100; i++)
			int1.add(rnd.nextInt(100)+1); 
		
		for(int i=0; i<100; i++)
			sum += int1.get(i);
		
		System.out.println(sum);
		
	}
}
