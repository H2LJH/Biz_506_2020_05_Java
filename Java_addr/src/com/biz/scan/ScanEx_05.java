package com.biz.scan;

import java.util.Scanner;
/*
 *  InputStream 문제로 인하여
 *  숫자를 scan 하는 nextInt() method를 수행한 후
 *  곧바로 이어서 문자열을 scan 하는 nextLine() method를 수행하면
 *  내부 메커니즘 문제로 인하여 buffer에 enter 코드가 남아 있다가
 *  곧바로 nextInt()를 수행한 후 nextLine()를 수행하면 의도하지 않게 코드가 진행된다.
 *  
 *  이 문제를 해결하기 위해 scanner 통해 키보드 입력을 받기 위해서는 nextLine()만 사용하기로 하였다.
 *  그런데 숫자를 2개 입력받아 덧셈을 수행한 후
 *  결과를 보고 싶은 코드를 작성하고 나니
 *  숫자의 덧셈이 아닌 숫자형 문자열의 연결을 만드는 코드가 되어 버렸다.
 *  
 *  만약 키보드에서 입력받은 문자열을 숫자형(int, float)으로 변환할수 있다면
 *  nextLine()을 사용하여 원하는 결과를 얻을수 있을 것이다.
 */  

public class ScanEx_05 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자1 입력 >> ");
		String strNum1 = scan.nextLine();
		int intNum1 = Integer.valueOf(strNum1); // Integer.valueOf() method드를 사용하여 숫자형으로 된 무자열 데이터를 정수형 데이터로 변환
		
		System.out.print("숫자2 입력 >> ");
		String strNum2 = scan.nextLine();
		int intNum2 = Integer.valueOf(strNum2);
		
		//System.out.println(strNum1 + strNum2);
		 System.out.printf("%d + %d = %d\n", intNum1, intNum2, intNum1 + intNum2);
		
		System.out.print("문자열 입력 >> ");
		String strInput = scan.nextLine();
		System.out.println("입력된 문자열 :" + strInput);

		scan.close();
	}
}
