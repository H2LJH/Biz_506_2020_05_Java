package com.biz.cars;

import com.biz.classis.Car;

public class Car_make_01 
{
	public static void main(String[] args) 
	{	
		/*
		 * Car class에는 전진(), 후진(), 멈춤() 등과 같은 함수(method)가 있다.
		 * Car class를 사용해서 소나타, 그랜져, 아우디 객체(인스턴스)를 생성하게 되면
		 * 
		 * 소나타.전진(), 그랜져.후진() 아우디.좌()와 같은 방법으로 명령을 수행할수 있게 된다.
		 * Car class를 한번만 작성하게 되면 현재 프로젝트에서 어디에서든 객체를 만들어 Car class에 method들을 호출하여 사용할수있다.
		 */
		
		Car 소나타 = new Car();
		Car 그랜져 = new Car();
		Car 아우디 = new Car();
	
		소나타.전진();
		그랜져.후진();
		아우디.좌회전();
		
		String 자동차 = "소나타";
		if(자동차=="소나타")
			System.out.println("자동차 전진");
		
		자동차 = "그랜져";
		if(자동차=="그랜져")
			System.out.println("자동차 후진");
	}
}

