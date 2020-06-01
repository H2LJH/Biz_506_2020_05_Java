package com.biz.classes.service;

/*
 *  class에 method를 선언해 두고
 *  class를 인스턴스로 생성하여 method를 호출하면 main method드를 간결화 시킬수 있다.
 */

public class Line_service 
{
	public String single(int num)
	{
		String line = ""; // 초기화
		for(int i=0; i<num; i++)
			line += "-";
		
		return line;
	}
	
	public String do_line(int num)
	{
		String line = ""; // 초기화
		for(int i=0; i<num; i++)
			line += "=";
		
		return line;
	}
}
