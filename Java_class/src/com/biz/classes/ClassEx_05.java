package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_05 
{
	public static void main(String[] args) 
	{
		Address addr = new Address();
		int age = addr.get_age(); // age 값을 setting 하기전 읽으면 값은 0이 나온다.
		addr.set_age(22);
		System.out.println(age);
		// class에 선언된 method들은 작성순서에 영향이 없다.
		// 인스턴스를 만들고 인스턴스를 통해서 호출되는 순서대로 코드가 작동한다.
	}
}
