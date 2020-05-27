package com.biz.grade;

public class Array_02 
{
	public static void main(String[] args) 
	{
		String[] str_nations = new String[5];
		
		str_nations[0] = "대한민국";
		str_nations[1] = "우리나라";
		str_nations[2] = "Repubilc of Korea";
		str_nations[3] = "Viva Korea";
		str_nations[4] = "우리나라 만세";
		
		for(int i=0; i<5; i++) 
			System.out.println(str_nations[i]);
		
		String str_nation = "";
		for(int i=0; i<5; i++)
			str_nation += str_nations[i] + "\t";
		
		System.out.println(str_nation);
	}
}
