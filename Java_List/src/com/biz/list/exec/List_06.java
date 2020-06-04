package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_06 
{
	public static void main(String[] args)
	{
		Random rnd = new Random();
		List<Character> charList = new ArrayList<>();
			
		//알파벳 개수 : 대소문자 각 26개
		//char char1 = (char)(rnd.nextInt(26) + 'A'); // A의 char code ASCII value : 96
		//System.out.println(char1);
		
		int createList = 100;
		for(int i=0; i<createList; i++)
		{
			char char1 = (char)(rnd.nextInt(26) + 'A');
			charList.add(char1);
		}
	
		int total = charList.size();
		for(int i=0; i<total; i++) 
		{
			char charF = charList.get(i); 
			if(charF == 'F')
			{
				System.out.println("charList first index : " + i);
				break;
			}
		}
		
		
	}
}
