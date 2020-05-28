package com.biz.grade;

public class Grade_01 
{
	public static void main(String[] args) // 진인접  
	{
		// 초기화 되지 않은 변수는 저장, 할당, 보관 만 할수있다.
		int num = 0; 	// integer type 변수 선언 + 초기화
			num = 1; 	// 선언된 변수에 값 저장
			
		int sum = num;  // num 변수에 보관중인 값을 읽어서 sum에 복사
			sum = 30; 	// 보관중인 num의 값은 사라지고 30으로 대체한다.
		
			System.out.println(sum);
		/* 변수 사용에 불가한 코드
		 * 
		 * 1. 변수는 연산자등이 부착되지 않은 상태로 단독으로 명령문을 이룰수 없다. Ex) num;
		 * 2. 변수는 변수 앞이나 뒤에 반드시 할당 연산자(=)가 있어야 한다. Ex) num=3; num+=3; num++; 
		 * 
		 */
		
	}
}
