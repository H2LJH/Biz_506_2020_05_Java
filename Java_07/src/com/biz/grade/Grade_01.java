package com.biz.grade;

public class Grade_01 
{
	public static void main(String[] agrs)
	{
		
		/* 변수 명명 규칙   
		 * 1. 변수 선언시 첫글자는 소문자(클래스와 혼동 방지)  
		 * 2. 두번째 글자부터 (영문 대소문자, 숫자, _, 한글,)로 선언할수 있지만 코드 읽기가 불편해질수 있어서 권하지는 않는다.
		 * 3. 변수이름을 지을때는 변수의 하는일이 단어에 담기도록 지어주는 것이 좋다.
		 * 4. 2개 이상의 단어를 묶어서 변수 이름을 작성하는 것이 좋다.
		 * 5. 변수명의 접두사를 변수의 type 키워드로 시작하면 코드가 길어졌을때(커졌을때) 변수의 type이 혼동되어 오류를 발생시키는 경우가 줄어든다.
		 * 6. 변수를 선언할때 가급적이면 어떤 값을 미리 저장하여 변수를 선언만하고 사용하려 할때 발생하는 오류도 막을수 있다. 
		*/
		
		int intKor  = 0;
		int intEng  = 0;
		int intMath = 0;
		System.out.println(intKor);
		
		intKor = 80;
		intKor = 90;
		intKor = 88;
		System.out.println(intKor);
		
		
		// 변수 값 저장  방식
		intKor = intKor+90;
		intKor += 90;
		
		int intSum = intEng + intKor + intMath;
			intSum =  intKor;
			intSum += intEng;
			intSum += intMath;
		
	}
}
