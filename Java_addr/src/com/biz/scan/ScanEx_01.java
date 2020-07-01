package com.biz.scan;

import java.io.InputStream;
import java.util.Scanner;
 
/*
 *  화면에 메뉴를 보여주고
 *  키보드로 선택을 하면 해당하는 코드를 실행
 */

/*
 * InputStream을 Scanner()에 연결하면 
 * InputStream으로 부터 전성되어온 데이터 코드를 
 * 실제의 문자열로 변환시키는 데이터코드로 변환시키는 역할을 수행한다.
 */

/*
 * 키보드 문자(열)을 입력하는동안 그 데이터코드를 임시의 저장장치(Buffer)에 저장을 하고 있다가
 * Enter를 누르는 순간 Scanner에게 입력이 완료되었음을 알려주는 역할을 한다.
 */

public class ScanEx_01 
{
	public static void main(String[] args) 
	{
		System.out.println(); 		  // console에 어떤 값을 출력
		InputStream in = System.in;   
		Scanner scan = new Scanner(in); // console에서 값을 입력
		
		 /*
		 * nextLine() 호출되면 코드는 여기세어 잠시 멈추고 있으면서 키보드에서 문자열이 입력되고 
		 * Enter가 입력되면 Scanner를 통해서 문자열을 가져오는 역할을 수행한다.
		 * 입력을 기다리면서 코드가 잠시 wait상태가 되는 현상을 blocking 되었다라고 한다.
		 */
		scan.nextLine(); 
	}
}
