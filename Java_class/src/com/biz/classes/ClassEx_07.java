package com.biz.classes;

import com.biz.classes.service.CalcService;

public class ClassEx_07 
{
	public static void main(String[] args) 
	{
		CalcService calc_service = new CalcService();
		
		int intkor = 90;
		int inteng = 80; 
		
		calc_service.add(intkor, inteng);
		calc_service.add(1, 2);
		
		int sum = calc_service.even(1, 100);
		System.out.println(sum);
		
		sum = calc_service.even(10, 1000);
		System.out.println(sum); 
		
		sum = calc_service.even(2, 55);
		System.out.println(sum);
		
		
		sum = calc_service.prime(2, 100);
		System.out.println(sum);
		
		sum = calc_service.prime(100, 1000);
		System.out.println(sum);
		
		sum = calc_service.prime(5, 99);
		System.out.println(sum);
		
		sum = calc_service.prime(4, 1000);
		System.out.println(sum);
		
	}
}
