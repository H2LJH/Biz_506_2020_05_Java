package com.biz.cars;

import com.biz.classis.Car;

public class Car_make_03 
{
	public static void main(String[] args) 
	{
		System.out.println("소나타가 전진 합니다.");
		System.out.println("소나타가 후진 합니다.");
		System.out.println("소나타가 정지 합니다.");
		
		System.out.println("그랜져가 전진 합니다.");
		System.out.println("그랜져가 후진 합니다.");
		System.out.println("그랜져가 좌회전 합니다.");
		System.out.println("====================");
		
		/*
		 * 1. 소나타 전진
		 * 2. 그랜져 전진
		 * 3. 소나타 후진
		 * 4. 그랜저 좌회전
		 * 5. 소나타 정지
		 * 6. 그랜져 후진
		 * 7. 소나타 전진
		 */
		
		Car cars = new Car();
		
		cars.전진("소나타");
		cars.전진("그랜져");
		cars.후진("소나타");
		cars.좌회전("그랜져");
		cars.정지("소나타");
		cars.후진("그랜져");
		cars.전진("소나타");
		
		
	}
}
