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
		AccountVO vo = new AccountVO();
		String strSc = "";
		
		System.out.print("입금 하실 금액 입력 : ");
		strSc = sc.nextLine();
		try 
		{
		  vo.setInput(Integer.valueOf(strSc));
		}

		catch (Exception e) 
		{
		   System.out.println("잘못 입력 하셨습니다.");
		   System.out.println("====================================");
		   return false;
		}
		
		Date date = new Date();
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String curDate = DateFormat.format(date);
		accList.add(vo);
		System.out.println("입금완료 되었습니다.");
		vo.setDate(curDate);
		System.out.println("====================================");
		return true;
		
	}

	@Override
	public boolean outputBalance() 
	{	AccountVO vo = new AccountVO();
		String strSc = "";
		int totalMoney = 0;
		int outputMoney = 0;
		
		System.out.printf("출금 금액 입력 : ");
		strSc = sc.nextLine();
		try
		{
		  accList.get(0).setOutput(Integer.valueOf(strSc));
		}
		catch (Exception e) 
		{
		  System.out.println("금액을 다시 입력하세요");
		  System.out.println("====================================");
		  return false;
		}
		
		for(AccountVO one : accList)
			totalMoney = one.getInput() - one.getOutput();
		
		if(totalMoney < outputMoney)
		{
		   System.out.println("잔액이 부족합니다.");
		   return false;
		}
		
		vo.setOutput(outputMoney);
		accList.add(vo);
		
		Date date = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-DD HH:mm");
		strSc = dateformat.format(date);

		System.out.println("출금 완료 되었습니다.");
		System.out.println("====================================");

		return true;
	}
		

	@Override
	public void listBalance() 
	{
		System.out.println();
		for(AccountVO one : accList)
		{
			System.out.print("입금 내역 : " + one.getInput()  + "\t" + one.getDate() + "\t" + 
					 "출금 내역 : " + one.getOutput() + "\t" + one.getDate() + "\n");
			
			System.out.print("현재 잔액 : " + (one.getInput()-one.getOutput()) + "\n");
		}
		
	}
	
}
