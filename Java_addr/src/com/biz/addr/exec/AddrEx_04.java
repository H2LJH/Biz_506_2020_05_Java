package com.biz.addr.exec;

import java.security.Provider.Service;

import com.biz.service.AddrService03;

public class AddrEx_04 
{
	public static void main(String[] args) 
	{
		AddrService03 addrService = new AddrService03();
		
		while(addrService.inputAddr()) {}

			
		addrService.addList();
		System.out.println("업무 종료");
	}
}
