package com.biz.classes;

// Java 언어를 사용하여 코딩할때 가장 기본적인 파일 단위
/* 클래스 이름 짓기(규칙)
 * 1. 첫글자 반드시 영문 대문자 
 * 2. 두번째 영문대소문자, 숫자, _를 사용
 * 3. 한글로도 작성할수 있지만 비추천
 * 4. class = 파일이름, 한개의 파일에는 한개의 클래스만 작성하는 것이 좋다.
 * 5. class 중에서 main() method가 클래스는 Run 했을때 제일먼저 실행 되는곳
 * 6. main() method가 없으면 작동 불가능
 */
public class ClassEx_01 
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1+num2);
	}
}
