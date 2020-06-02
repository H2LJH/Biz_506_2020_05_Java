package com.biz.service;

/*
 *  class 중에서 main() method가 없는 클래스는 혼자서는 작동하지 않는다.
 *  main() method가 있는 곳에서 클래스 인스턴스 생성하여 이용 해야 한다.
 *  인스턴스.메서드() Dot(.)연산자를 통해서 호출한다.
 */

public class MethodService 
{
	public void print(int num)
	{
		System.out.println(num);
	}
}
