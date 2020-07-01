package com.biz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.domain.AddrVO;

/*
 * 입력 도중 입력을 중단하고 싶을때 중단할수 있도록 코드를 개선
 */


public class AddrService03 
{
	private List<AddrVO> addrList;
	private Scanner scan;
	
	public AddrService03()
	{
		addrList = new ArrayList<AddrVO>();
		scan = new Scanner(System.in);
	}
	
	public boolean inputAddr()
	{
		System.out.print("이름(중단 : End) >> ");
		String strName = scan.nextLine();
		
		if(strName.equalsIgnoreCase("END"))
		{
			System.out.println("End 입력으로 인한 종료");
			return false;
		}
		
		System.out.print("전화번호 >> ");
		String strTel = scan.nextLine();
		
		System.out.print("주소 >> ");
		String strAddr = scan.nextLine();
		
		System.out.print("나이 >> ");
		String strAge = scan.nextLine();
		
		System.out.print("관계 >> ");
		String strNet = scan.nextLine();
		
		int intAge = 0;
		
		try {intAge = Integer.valueOf(strAge);}
		catch (Exception e) 
		{
			System.out.println("나이는 숫자만 입력 가능합니다.");
			System.out.println("나이는 입력이 잘못 되었으므로 0으로 임시 저장합니다.");
		}
		
		AddrVO addrVO = new AddrVO();
		addrVO.setName(strName);
		addrVO.setTel(strTel);
		addrVO.setAddr(strAddr);
		addrVO.setNet(strNet);
		addrVO.setAge(intAge);
		addrList.add(addrVO);
		
		return true;
	}
	
	
	public void addList()
	{
		
		System.out.println("=============");
		System.out.println("주소록");
		System.out.println("=============");
		System.out.println("이름\t 전화번호\t 주소\t 나이\t 관계\t");
		for(int i=0; i<addrList.size(); ++i)
		{
			AddrVO vo = this.addrList.get(i);
			System.out.print(vo.getName() + "\t" + 
							 vo.getTel()  + "\t" + 
							 vo.getAddr() + "\t" + 
							 vo.getAge()  + "\t" + 
							 vo.getNet()  + "\n");
			
		}
	
	}
}
