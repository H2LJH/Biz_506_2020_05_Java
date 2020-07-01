package com.biz.scan;

import java.util.Scanner;

public class ScanEx_02 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("영문자열 입력 >> "); // prompt : 사용자에게 수행할일을 미리 알려주는 역할을 하는 출력문 
		String strInput = scan.nextLine(); // 키보드에서 문자열이 입력되기를 기다리고 있다가 문자열이 입력되면 입력된 문자열을 Strinput변수에 담아달라		
		System.out.println("입력된 문자열 : " + strInput);
	}
}
