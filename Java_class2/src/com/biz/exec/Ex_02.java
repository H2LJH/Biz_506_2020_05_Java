package com.biz.exec;

import com.biz.service.AddrserviceV1;

public class Ex_02 
{
	public static void main(String[] args) 
	{
		String[] addr = new String[]{"광주", "서울", "부산", "목포", "인천"};
		String[] name = new String[] {"이씨", "김씨", "박씨", "정씨", "손씨"};
		String[] tel = new String[] {"010-1", "010-2", "010-3", "010-4", "010-5"};
		int[] age = new int [] {1,2,3,4,5};
	
		int total_addr = 5;
		AddressVo[] array_addr = new AddressVo[total_addr];
	
		for(int i=0; i<total_addr; ++i)
			array_addr[i] = new AddressVo();
		
		for(int i=0; i<total_addr; ++i)
		{
			array_addr[i].setInt_age(age[i]);
			array_addr[i].setStr_name(name[i]);
			array_addr[i].setStr_tel(tel[i]);
			array_addr[i].setStr_addr(addr[i]);
		}
	
		AddrserviceV1 addr_service = new AddrserviceV1();
		addr_service.addrList(array_addr);
	}
}
