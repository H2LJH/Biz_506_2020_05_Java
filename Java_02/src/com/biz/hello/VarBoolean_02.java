package com.biz.hello;

public class VarBoolean_02 {
	public static void main(String[] agrs)
	{
		boolean bVar1 = true;
		boolean bVar2 = true;
		// 3 > 3의 비교연산을 수행하여 결과를 bVar2에 저장하라
			    bVar2 = 3 > 3;
			    System.out.println(bVar2);
			    
			    bVar1 = 3 < 3;
			    System.out.println(bVar1);
			    
			    bVar1 = 3 >= 3;
			    bVar2 = 3 <= 3;
			    Boolean bVar3 = bVar1 == bVar2;
			    System.out.println(bVar3);
			    
			    bVar3 = bVar3 != bVar2;
			    System.out.println(bVar3);
			    
			    bVar1 = 3 >= 3;
			    bVar2 = 3 > 3;
			    bVar3 = bVar1 != bVar2;
			    System.out.println(bVar3);
			    
			    bVar3 = bVar1 || bVar2;
			    System.out.println(bVar3);
			    
			    bVar3 = bVar1 && bVar2;
			    System.out.println(bVar3);
	}

}
