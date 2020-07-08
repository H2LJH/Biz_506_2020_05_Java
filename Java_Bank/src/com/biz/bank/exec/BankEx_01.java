package com.biz.bank.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.domain.AccountVO;

public class BankServiceImplV1 implements BankService
{
	List<AccountVO> accList;
	Scanner sc;

	public BankServiceImplV1() 
	{
		accList = new ArrayList<AccountVO>();
		sc = new Scanner(System.in);
	}

	@Override
	public boolean inputBalance() // inputBalance()를 호출하여 입금처리를 수행
	{
		String strSc = "";
		int inputMoney = 0;
		System.out.print("입금 하실 금액 입력 : ");
		strSc = sc.nextLine();
		try 
		{
			inputMoney = Integer.valueOf(strSc);
			strSc = "";
		}

		catch (Exception e) 
		{
		   System.out.println("잘못 입력 하셨습니다.");
		   return false;
		}
		AccountVO vo = new AccountVO();	
		Date date = new Date();
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		strSc = DateFormat.format(date);
		
		vo.setInput(inputMoney);
		vo.setDate(strSc);
		accList.add(vo);
		System.out.println("입금완료 되었습니다.");
		return true;
		
	}

	@Override
	public boolean outputBalance() 
	{	
		String strSc = "";
		int totalMoney = 0;
		int outputMoney = 0;
		
		System.out.printf("출금 금액 입력 : ");
		strSc = sc.nextLine();
		try
		{
			outputMoney = Integer.valueOf(strSc);
			strSc = "";
		}
		catch (Exception e) 
		{
		  System.out.println("금액을 다시 입력하세요");
		  return false;
		}
		
		for(AccountVO one : accList)
			totalMoney += one.getInput() - one.getOutput();
		
		if(totalMoney < outputMoney)
		{
			System.out.println("잔액이 부족합니다.");
			return false;
		}
		
			AccountVO vo = new AccountVO();
			vo.setOutput(outputMoney);
			
			Date date = new Date();
			SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			strSc = dateformat.format(date);
			
			vo.setDate(strSc);
			accList.add(vo);
			System.out.println("출금 완료 되었습니다.");
			return true;
	}
		

	@Override
	public void listBalance() 
	{
		int totalMoney = 0;
		System.out.println("====================================");
		System.out.println("날짜\t\t\t 입금\t 출금\t 잔액");
		System.out.println("====================================");
		for(int i=0; i<accList.size(); ++i)
		{
			totalMoney += accList.get(i).getInput() - accList.get(i).getOutput();
			
			 System.out.printf("%s\t%d\t%d\t%d\n", accList.get(i).getDate(), 
					 							   accList.get(i).getInput(), 
					 							   accList.get(i).getOutput(), 
					 							   totalMoney); 
		}
		
	}


	
}
