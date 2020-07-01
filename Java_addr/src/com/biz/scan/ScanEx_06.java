package com.biz.scan;

import java.util.Scanner;

public class ScanEx_06 
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
		int intMenu = Integer.valueOf(strMenu);
		
		switch (intMenu) 
		{
			case -1:
				System.out.println("종료 되었습니다.");
				break;

			case 1:
				System.out.println("학생 정보 입력처리");
				break;
				
			case 2:
				System.out.println("성적 정보 입력처리");
				break;
			
			case 3:
				System.out.println("성적 정보 출력처리");
				break;
		}
		
		scan.close();
	}
}
