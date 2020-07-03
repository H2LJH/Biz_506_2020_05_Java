package com.biz.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.book.domain.BookVO;

/*
 * BookService interface를 implements하여 작성
 * 구체적인 method의 코드를 작성해야 한다.
 */
public class BookServiceimplV1 implements interfaceBookService
{
	List<BookVO> listVO;
	Scanner sc;
	
	public BookServiceimplV1() {
		listVO = new ArrayList<BookVO>();
		sc = new Scanner(System.in);
	}
	
	
	@Override
	public boolean inpuBook() 
	{	
		BookVO vo = new BookVO();
		String[] VOmembers = new String[] {"책이름", "출판사", "글쓴이", "출판연도", "가격"};
		String strN = "";
		int intN = 0;
		
		System.out.println("=========================");
		System.out.println("[end] 입력시 종료");
		for(int i=0; i<vo.getvarCnt(); ++i)
		{
			System.out.println("=========================");
			System.out.print(VOmembers[i] + " 입력 : ");
			strN = sc.nextLine();
			
			if(strN.equals("end"))
				return false;
			
			switch (i) 
			{
			case 0:
				vo.setTitle(strN);
				break;
			case 1:
				vo.setComp(strN);
				break;
			case 2:
				vo.setWriter(strN);
				break;
			case 3:
				try {
					intN = Integer.valueOf(strN);
					vo.setYear(intN);
				} 
					
				catch (Exception e) {
					 return true;
				}
				break;
			case 4:
				try {
					intN = Integer.valueOf(strN);
					vo.setPrice(intN);	
				}
				catch (Exception e) {
					return true;
				}
				break;
			}
		}
		listVO.add(vo);
		return true;
	}

	@Override
	public void bookList() 
	{
		System.out.println("=======================================");
		System.out.println("책이름\t출판사\t글쓴이\t출판년도\t가격");
		System.out.println("=======================================");
		for(BookVO one : listVO)
			System.out.print(one.getTitle() + "\t" + 
							 one.getComp()  + "\t" +
							 one.getWriter()+ "\t" +
							 one.getYear()  + "\t" + 
							 one.getPrice() + "\n");
	}
	
	
	
}
