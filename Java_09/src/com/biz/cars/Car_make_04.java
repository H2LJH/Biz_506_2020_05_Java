package com.biz.cars;

import com.biz.classis.Car;

public class Car_make_04 
{
	public static void main(String[] args) 
	{
		Car 소나타 = new Car();
		Car 그랜져 = new Car();
		
		소나타.이름 = "소나타";
		그랜져.이름 = "소나타";
		
		소나타.전진();
		그랜져.전진();
		소나타.후진();
		그랜져.좌회전();
		소나타.정지();
		그랜져.후진();
		소나타.전진();
		
		/*
		 *  Car class를 사용해서 생성된 소나타 객체를 만들게 되면
		 *  Car class에 선언된 method를 소나타의 method 명령문 처럼 사용할수 있다.
		 *  method의 호출,사용 
		*/
		
		소나타.주차();
		그랜져.주차();
		
	}
}
