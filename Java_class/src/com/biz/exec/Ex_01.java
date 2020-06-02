package com.biz.exec;

import com.biz.classes.model.Address_VO;

public class Ex_01 
{
	public static void main(String[] args) 
	{
		Address_VO addr_vo = new Address_VO();
		Address_VO addr_vo2 = new Address_VO();
		Address_VO addr_vo3 = new Address_VO();
		
		addr_vo.setStr_name("홍길동");
		addr_vo.setStr_tel("010-1111-2222");
		addr_vo.setStr_addr("광주");
		addr_vo.setInt_age(1);
		
		addr_vo2.setStr_name("홍길당");
		addr_vo2.setStr_tel("010-1112-2222");
		addr_vo2.setStr_addr("광주");
		addr_vo2.setInt_age(2);
		
		addr_vo3.setStr_name("홍길덩");
		addr_vo3.setStr_tel("010-1113-2222");
		addr_vo3.setStr_addr("광주");
		addr_vo3.setInt_age(3);
		
		
		// 할당된 값 콘솔 출력 방식
		String addr1 = addr_vo.getStr_name();
		String addr2 = addr_vo.getStr_name();
		String addr3 = addr_vo.getStr_name();
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println(addr3);
		
		System.out.println(addr_vo.getStr_name());
		System.out.println(addr_vo2.getStr_name());
		System.out.println(addr_vo3.getStr_name());
		
	}
}
