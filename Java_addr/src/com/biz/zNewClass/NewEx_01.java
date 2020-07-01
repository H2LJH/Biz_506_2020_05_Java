package com.biz.zNewClass;

public class NewEx_01 
{
	public static void main(String[] args) 
	{
		// NewClass_01 클래스에는 기본 생성자를 임의로 만들지 않았지만
		// 자동으로 기본 생성자가 선언이 되므로 생성자를 호출하여 nc 객체를 초기화 할수 있다.
		NewClass_01 nc = new NewClass_01();
		
		// 생성자가 한개인데 매개변수가 있는 생성자다.
		NewClass_02 nc2 = new NewClass_02(123456789);
		
		// 기본생성자 + 필드생성자
		NewClass_03 nc3 = new NewClass_03();
		nc3 = new NewClass_03(1);
		
		
		
	}
}
