import java.util.Random;

public class if_05 
{
	public static void main(String[] args) 
	{
		
		// if문이 True  라면  else는 작동 안한다.
		// if문이 false 라면  else는 작동 한다. 
		
		Random rnd = new Random();
		int   num1 = rnd.nextInt(100)+1;
		
		if(num1 % 5 == 0) 
			System.out.printf("%d는 5의 배수\n", num1);
		
		else if(num1 % 4 == 0) 
			System.out.printf("%d는 4의 배수\n", num1);
		
		else if(num1 % 3 == 0) 
			System.out.printf("%d는 3의 배수\n", num1);
		
		else if(num1 % 2 == 0) 
			System.out.printf("%d는 2의 배수\n", num1);
		
		else 
			System.out.printf("%d는 5,4,3,2의 배수가 아니다.\n", num1);
	}
}
