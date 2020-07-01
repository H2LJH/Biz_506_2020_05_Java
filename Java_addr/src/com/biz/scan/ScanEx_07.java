package com.biz.scan;

import java.util.Scanner;

public class ScanEx_07 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("자바 메뉴 시스템");
		System.out.println("=================================");
		System.out.println("1. 학생 정보 입력\n" + 
						   "2. 성적정보입력\n"   + 
				           "3. 성적출력\n" + 
						   "-1. 종료"); 
		System.out.println("=================================");
		System.out.print("업무 선택 >> ");
		
		String strMenu = scan.nextLine();
		int intMenu = 0;
		try
		{
			intMenu = Integer.valueOf(strMenu);
		}
		catch (Exception e)
		{
			System.out.println("입력한 값 :" + strMenu);
			System.out.println("업무 선택은 숫자 1-3 또는 -1만 가능");
			return; // expception이 발생했으니 더이상 다음으로 코드 진행을 하지 말고 종료하라
		}
		
		if(intMenu == -1)
			System.out.println("종료 되었습니다.");
		
		else if(intMenu == 1)
			System.out.println("학생 정보 입력처리");
		
		else if(intMenu == 2)
			System.out.println("성적 정보 입력처리");
		
		else if(intMenu == 3)
			System.out.println("성적 정보 출력처리");
		scan.close();
	}
}
