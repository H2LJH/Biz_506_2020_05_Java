package com.biz.cars;

import com.biz.classis.Car;

/*
 *  1.Car_make_02 class에는 main() method가 있다.
 *  2. main() method는 진인점, 시작점 method라고 한다.
 *  3. 이 클래스는 이클립스에서 실행(Run)을 하게 되면 main() method에 명령문들이 실행된다.
 */


public class Car_make_02 // 클래스 선언문
{
	public static void main(String[] args) // main method 선언문 
	{
		System.out.println("Car_make_02 class 시작");
		
		// Car class를 사용하여 소나타, 그랜져, 아우디 객체를 생성
		Car 소나타 = new Car();
		Car 그랜져 = new Car();
		Car 아우디 = new Car();
		
		int sum; // 변수 선언문	
		
		소나타.이름 = "소나타"; // 변수 선언문
		소나타.전진();
		
		그랜져.이름 = "요즘 잘나가는 성공한 사람이 타는 차";
		그랜져.후진();
		
		// Car class는 객체를 생성하기 위해 만들어진 class이다.
		// Car class 함수(method)들은 직접 사용할수 없다. 사용하려면 내자동차.전진()이라고 명령을 시작해야한다. 
		Car 내자동차 = new Car();
		내자동차.전진();
		
	}
}
