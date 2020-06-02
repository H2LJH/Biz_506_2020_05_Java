public class Hello_02 
{
	public static void main(String[] args)
	{
		System.out.println(30 + 40 - 10);
		System.out.println(30 * 40 - 10);
		System.out.println((30 - 40)  * 10);
		
		// 문자와 숫자를 연산할때  같은 연산자를 사용할때는 연산 우선순위를 명확하게 구분 해줘야 한다.
		System.out.println("30 + 40 = " + 30 + 40);  
		System.out.println("30 + 40 = " + (30 + 40));
	}
		
}