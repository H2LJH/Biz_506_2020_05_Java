package com.biz.addr.exec;

import com.biz.service.AddrService03;

public class AddrEx_03 
{
	public static void main(String[] args) 
	{
		AddrService03 addService = new AddrService03();
		
		for(int i =0; i < 100; ++i)
		{
			System.out.println("=====================");
			System.out.println((i+1) + "번째 주소록");
			System.out.println("=====================");
			boolean ret = addService.inputAddr();
			if(ret == false)
				break;
		}
		System.out.println("입력 종료");
		
	}
}
