package com.biz.service;

import com.biz.exec.AddressVo;

public class AddrserviceV1 
{
	public void addrList(AddressVo[] addr_vo)
	{
		System.out.println("--------------------------------------");
		System.out.println("\t   주 소 록");
		System.out.println("--------------------------------------");
		System.out.println("이름\t 나이\t 주소\t 전화");
		System.out.println("--------------------------------------");
		for(int i=0; i<addr_vo.length; ++i)
		{
			System.out.printf("%s\t %d\t %s\t %s \n", addr_vo[i].getStr_name(),addr_vo[i].getInt_age(),
													  addr_vo[i].getStr_addr(),addr_vo[i].getStr_tel());
			System.out.println("--------------------------------------");
		}
	}
}
