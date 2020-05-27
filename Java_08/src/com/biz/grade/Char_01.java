package com.biz.grade;

// 아스키 코드
// char Type 변수에 담겨있는 코드값을 정수형 변수에 할당하면 문자가 실제 10진수 코드값으로 변경되어 저장한다.
public class Char_01 
{
	public static void main(String[] args) 
	{
		char charA = 65;
		char charZ = 'Z';
		
		int intA = charA;
		int intZ = charZ;

		// %c : 정수형 변수에 저장된 값을 문자로 바꾸어서 보여달라는 기호
		// %d : 정수형 변수에 저장된 값을 10진수로 보여달라는 기호
		// 주요  ACII 코드 : Enter:13, ESC:27
		for(int i='A'; i<='Z'; ++i)
			System.out.printf("%c : %d\n", i, i);
		
		for(int i='a'; i<='z'; i++)
			System.out.printf("%c : %d\n", i, i);
		
		for(int i='0'; i<= '9'; i++)
			System.out.printf("%c : %d\n", i, i);
		
		int count = 0;
		for(int i='0'; i< 'z'; i++)
		{
			System.out.printf("%c : %d\t", i, i);
			if(++count % 5 == 0)
				System.out.printf("\n");
				
		}
	}
}
