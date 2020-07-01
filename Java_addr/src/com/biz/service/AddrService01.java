package com.biz.service;

import java.util.ArrayList;

import com.biz.domain.AddrVO;

public class AddrService01 
{
	/*  3가지 변수 초기화 방법 ===================================
	 * 
	 *  1. 필드변수 선언과 동시에 인스턴스 생성
	 *  2. 생성자를 이용하여 인스턴스 생성
	 *  3. 사용하기 직전에 필드변수 인스턴스 생성
	 ============================================================= */
	 
		private ArrayList<AddrVO> addrList; // 필드변수 객체선언
		
		public AddrService01()
		{
			this.addrList = new ArrayList<AddrVO>();
		}
		
		public void makeAdd()
		{
			for(int i=0; i<5; i++)
			{
				AddrVO addrVO = new AddrVO();
				addrVO.setAge(i);
				addrVO.setName(""+i);
				addrVO.setTel(""+i);
				addrVO.setAddr(""+i);
				addrVO.setNet(""+i);
				this.addrList.add(addrVO);
			}
		
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
