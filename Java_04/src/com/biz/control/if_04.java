package com.biz.control;
import java.util.Random;

public class if_04 
{
	public static void main(String[] args)
	{
		Random rnd = new Random();
		int num1 = rnd.nextInt(100)+1;
		
		if(num1 % 5 == 0)
			System.out.printf("%d는 5의 배수\n",num1);

		if(num1 % 4 == 0)
			System.out.printf("%d는 4의 배수\n",num1);
		
		if(num1 % 3 == 0)
			System.out.printf("%d는 3의 배수\n",num1);
		
		if(num1 % 2 == 0)
			System.out.printf("%d는 3의 배수\n",num1);
		
		
		// &&(AND)연산은 조건들이 모두 true이여야 한다.
		if((num1 % 5 != 0) && (num1 % 4 != 0) && 
		   (num1 % 3 != 0) && (num1 % 2 != 0))
			System.out.println("%d는 5,4,3,2의 배수가 아니다.\n");
	}
}
