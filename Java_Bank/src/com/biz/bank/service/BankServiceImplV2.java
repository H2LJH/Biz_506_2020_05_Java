package com.biz.bank.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.biz.bank.config.Lines;
import com.biz.bank.domain.AccountVO;

public class BankServiceImplV2 implements BankService{
	protected List<AccountVO> accList;
	protected Scanner scan;
	
	public BankServiceImplV2()
	{
		accList = new ArrayList<AccountVO>();
		scan = new Scanner(System.in);
	}
	
	protected void keyInput(String inout) 
	{
		
		String title = inout.equals("INPUT") ? "입금액" : "출금액";	
		//System.out.printf("%s >> ", title);
		System.out.printf("%s 을 입력하세요 >>", title);
		String strInput = scan.nextLine();
		
		int intInput = 0;
		try 
		{
			intInput = Integer.valueOf(strInput);
		} 
		
		catch (Exception e) 
		{
			System.out.println("금액은 숫자만 가능합니다.");
			return;
		}
		
		if(inout.equals("OUPUT")) 
		{
			int balance = 0;
			for(AccountVO accVO : accList)
			{
				balance += accVO.getInput();
				balance -= accVO.getOutput();
			}
			
			if(balance < intInput)
			{
				System.out.println("잔액이 부족하여 출금할 수 없음!!");
				return;
			}
		}
		
		Date date = new Date();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  // 2020-07-08
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");  // 11:39:00
		
		String curDate = dateFormat.format(date); 
		String curTime = timeFormat.format(date); 
		
		AccountVO accVO = new AccountVO();
		
		accVO.setDate(String.format("%s %s", curDate,curTime));
		
		if(inout.equals("INPUT")) 
		{
			accVO.setInput(intInput);
		} 
		
		else 
		{
			accVO.setOutput(intInput);
		}
		
		accList.add(accVO);
	}
	
	@Override
	public boolean inputBalance() 
	{
		this.keyInput("INPUT");
		return true;
	}
	@Override
	public boolean outputBalance() 
	{
		keyInput("OUTPUT");
		return true;
	}
	@Override
	public void listBalance() 
	{
		DecimalFormat df =new DecimalFormat("##,###"); // 숫자를 회계방식 문자열로 표현하기 위한 클래스 
		String[] listTitle = {"거래일자","입금액","출금액","잔액"};
		
		System.out.println(Lines.dLine);
		System.out.println("001 계좌 입출금 내역서");
		System.out.println(Lines.dLine);
		System.out.printf("%-20s %20s %20s %20s\n", listTitle[0], listTitle[1], listTitle[2], listTitle[3]); // %20s : 문자열을 표현하기 위해 20개의 칸을 만들고 문자열을 채운후 나머지는 빈칸으로 남겨두어라
																									      //        문자열은 20개 칸에서 오른쪽으로 정렬하라.
																										  // %-20s : 왼쪽으로 정렬
		System.out.println(Lines.sLine);
		
		String strNumber = "";
		
		int balance = 0;
		for(AccountVO accVO : accList) 
		{
			System.out.printf("%20s\t|", accVO.getDate());
			System.out.printf("%20s\t|", df.format(accVO.getInput()));
			System.out.printf("%20s\t|", df.format(accVO.getOutput()));
			
			balance += accVO.getInput();
			balance -= accVO.getOutput();
			System.out.printf("%s\n", balance);
		}
		System.out.println(Lines.dLine);
		System.out.println("출력 완료! 아무키나 누르세요 :)");
		scan.nextLine();
	}
}