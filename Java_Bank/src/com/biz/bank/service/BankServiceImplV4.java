package com.biz.bank.service;

import java.io.File;

public class BankServiceImplV4 extends BankServiceImplV3 
{
	private String accNum = "";
	private String basePackage = "";
	
	public boolean account() // 사용자로 부터 계좌번호를 입력받은 역할을 수행
	{
		basePackage = "src/com/biz/exec/data";
		System.out.print("계좌번호 입력 (정수값 5자리 이내) : ");
		accNum = scan.nextLine();
		
		try 
		{
			accNum = String.format("BALANCE-%05d.txt", Integer.valueOf(accNum)); // ex : BALANCE-0000X.txt
		}
		
		catch (Exception e) 
		{
			System.out.println("계좌번호는 정수 5자리 이내 값만 가능");
			return false;
		}
		
		System.out.println("게좌번호 : " + accNum);
		
		File file = new File(basePackage, accNum);
		this.bFileName = basePackage + File.separator + accNum;
		this.loadBalance(); // 새로 입력된 계좌번호에 해당하는 정보 로딩
		return true;
	}
}
