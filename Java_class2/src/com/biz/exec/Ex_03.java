package com.biz.exec;

import com.biz.service.MethodService;

/*
 * method() 선언문
 * print(int num) method를 선언해 두고 필요시 호출해서 사용한다.
 * print() 괄호안 선언된 변수는 매개변수,아규먼트(args),파라미터 라고 한다.
 */

public class Ex_03 
{
	public static void main(String[] args) 
	{
		int num1 = 30;
		MethodService mService = new MethodService();
		
		mService.print(num1);
		mService.print(50);
	}
}
