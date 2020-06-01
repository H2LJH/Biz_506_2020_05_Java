package com.biz.classes;

import com.biz.classes.service.Line_service;

public class ClassEx_08 
{
	public static void main(String[] args) 
	{
		Line_service line = new Line_service();
		
		System.out.println(line.do_line(30));
		System.out.println("\t성적 일람표");
		System.out.println(line.do_line(30));
		System.out.println("\t" + 90);
		System.out.println("\t" + 90);
		System.out.println("\t" + 90);
		System.out.println(line.do_line(30));
		System.out.println("\t" + 270);
		System.out.println(line.do_line(30));
	}
}
