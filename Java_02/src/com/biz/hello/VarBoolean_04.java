package com.biz.hello;

public class VarBoolean_04 
{
	public static void main(String[] agrs)
	{
		// boolean형 변수는 오로지 true,false 1가지 값만을 취급
		// 다른 키워드와 조합하며 연산명령을 수행하는 용도
		boolean bVar1 = false;
		boolean bvar2 = false;
		
		int num1 = 34;
		bVar1 = (num1 % 2) == 0; // num1가 even OR odd ?
		System.out.println((++num1 + "는 짝수? = ") + (num1 % 2 == 0));
		System.out.println((++num1 + "는 짝수? = ") + (num1 % 2 == 0));
		System.out.println((++num1 + "는 짝수? = ") + (num1 % 2 == 0));
		System.out.println((++num1 + "는 짝수? = ") + (num1 % 2 == 0));
	}
}
