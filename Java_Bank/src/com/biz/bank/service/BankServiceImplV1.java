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
	List<Integer> inputList;
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
		while(true)
		{
			System.out.print("입금 하실 금액 입력 : ");
			strSc = sc.nextLine();
			try 
			{
				Date date = new Date();
				SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				String curDate = DateFormat.format(date);
				
				vo.setInput(Integer.valueOf(strSc));
				accList.add(vo);
				System.out.println("입금완료 되었습니다.");
				vo.setDate(curDate);
				System.out.println("====================================");
				return true;
			}
			
			catch (Exception e) 
			{
				System.out.println("잘못 입력 하셨습니다.");
				System.out.println("====================================");
				continue;
			}
		}
	}

	@Override
	public boolean outputBalance() 
	{	
		String strSc = "";
				while(true)
				{
				System.out.printf("출금 금액 입력 : ");
				strSc = sc.nextLine();
				try
				{
					accList.get(0).setOutput(Integer.valueOf(strSc));
					if(accList.get(0).getInput() - accList.get(0).getOutput() > 0)
					{
						Date date = new Date();
						SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-DD HH:mm");
						strSc = dateformat.format(date);
						
						accList.get(0).setInput(-accList.get(0).getOutput());
						accList.get(0).setDate(strSc);
						
						System.out.println("출금 완료 되었습니다.");
						System.out.println("====================================");
						break;
					}
					else
					{
						System.out.println("잔액이 부족합니다.");
						System.out.println("현재 잔액 : " + accList.get(0).getOutput());
						System.out.println("====================================");
						continue;
					}
				}
					catch (Exception e) 
					{
						System.out.println("금액을 다시 입력하세요");
						System.out.println("====================================");
					}
				}
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
