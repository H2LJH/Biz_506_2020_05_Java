package com.biz.classes;

import com.biz.classes.service.Line_service;
import com.biz.classes.service.Score_service;

public class ClassEx_09 
{
	public static void main(String[] args) 
	{
		Line_service  line  = new Line_service();
		Score_service score = new Score_service();
		
		int ikor  = 90;
		int ieng  = 80;
		int imath = 78;

		String d_line = line.do_line(30);
		String s_line = line.single(30);
		
		System.out.println(d_line);
		System.out.println("\t성적일람표");
		System.out.println(s_line);
		System.out.println("국어\t영어\t수학\t총점");
		System.out.println(s_line);
		System.out.printf("%d\t %d\t %d\t %d\n",ikor,ieng,imath,score.sum(ikor,ieng, imath));
		System.out.println(d_line);
		
	}
}
