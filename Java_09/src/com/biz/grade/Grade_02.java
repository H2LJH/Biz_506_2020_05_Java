package com.biz.grade;

import java.util.Random;

public class Grade_02 
{
	public static void main(String[] args)
	{
		// rnd : 인스턴스,객체라고 부른다.
		// 변수이면서 일반적인 변수와는 다른 성질을 갖는다.
		Random rnd = new Random();
		
		// 점, Dot(.)연산을 사용하여 또다른 기능의 명령어를 연결하고 명령문을 이룰수 있다.
		// 아래의 명령문은 아무일도 수행하지 않는 것 처럼 보이지만 실제로는 무언가 기능을 수행하게 된다.
		// nexInt() method는 Console에 표시하는 기능이 없기때문에 단독으로 Console로 확인할수 없다. 
		// Dot 연산을 사용하여 연결되는 명령문 중()가 부착되는 명령문을 method라고 부른다. (method는 클래스에 종속 되어있는 함수이다.)
		rnd.nextInt();
		
		// nexInt() Method의  결과를 Console에 나타내고 싶으면 변수와 연결하여 사용한다. 
		int num = rnd.nextInt();
		System.out.println(num);
		
		// nexInt() 사칙연산잔와 혼합하여 연산을 수행할수 있는데 이때는 그 결과를 반드시 다른 변수에 보관해야 한다.
		// System.out.println() 라는 3개의 명령어가 Dot(.) 연산자로 연결되어 하나의 명령문이 된 형태이다.
		// 값,연산결과, 변수에 담긴 값 들을 Console에 보여주는 명령문이다. 
		num = rnd.nextInt() / 10;
		System.out.println(num);
	}
}
