package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

import com.biz.bank.config.Posion;
import com.biz.bank.domain.AccountVO;

/*
 * V3 업그레이드
 * 프로젝트가 시작될때 balance.txt 파일을 읽어서
 * 거래내역을 가져오고
 * 입출금 업무를 수행하면 입출금 항목을 계속 추가하고
 * 업무를 종료하면 추가된 입출금 항목을 다시 balance.txt 파일에 추가하여
 * 다음 프로젝트가 시작될때 그 내용을 유지하도록 하자.
 */

public class BankServiceImplV3 extends BankServiceImplV2 
{
	String bFileName = "";
	
	public BankServiceImplV3() 
	{
		bFileName ="src/com/biz/exec/data/balance.txt";
		this.loadBalance();
	}
		
	protected void loadBalance()
	{
		// 기존 accList를 모두 제거하기
		// 기존 List를 제거하지 않으면 계좌를 선택할때마다 리스트가 추되어 나타나게 된다.
		
		accList.clear(); 
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try 
		{
			fileReader = new FileReader(bFileName);
			buffer = new BufferedReader(fileReader);
			String reader = "";
			
			while(true)
			{
				reader = buffer.readLine();
				
				if(reader == null)
					break;
				
				String[] balance = reader.split(",");
				AccountVO vo = new AccountVO();
				
				vo.setDate(balance[Posion.ACC_DATE]);
				vo.setInput(Integer.parseInt(balance[Posion.ACC_INPUT]));
				vo.setOutput(Integer.parseInt(balance[Posion.ACC_OUTPUT]));	
				accList.add(vo);
			}
			buffer.close();
			fileReader.close();
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("계좌거 없으므로 새로운 계좌를 개설합니다.");
		}
		
		catch (IOException e) 
		{e.printStackTrace();}
		
	}
	
	
	@Override
	public boolean inputBalance() 
	{
		this.keyInput("INPUT");
		this.saveBalance();
		return true;
	}

	@Override
	public boolean outputBalance() 
	{
		this.keyInput("OUTPUT");
		this.saveBalance();
		return true;
	}
	
	protected void saveBalance()
	{
		PrintStream outPut = null;
		try 
		{
				outPut = new PrintStream(bFileName);
				int balance = 0;
				
				for(AccountVO vo : accList)
				{
					balance += vo.getInput() - vo.getOutput();
					outPut.printf("%s,%d,%d,%d\n", vo.getDate(), vo.getInput(), vo.getOutput(), balance);
				}
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
}
