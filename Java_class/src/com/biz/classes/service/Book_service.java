package com.biz.classes.service;

import com.biz.classes.model.Book_VO;

public class Book_service 
{
	public void book_info(Book_VO book)
	{
		System.out.printf("  ISBS : %s \n", book.isbn);
		System.out.printf("도서명 : %s \n", book.title);
		System.out.printf("  저자 : %s \n", book.auth);
		System.out.printf("회사명 : %s \n", book.comp);
		System.out.printf(  "가격 : %d \n", book.price);
	}
	
	
	public void book_list(Book_VO[] book_list)
	{
		Line_service lineService = new Line_service();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("\t\t   도서목록");
		System.out.println(d_line);
		System.out.println("ISBN \t  도서명 \t글쓴이 \t 출판사  가격");
		System.out.println(d_line);
		for(int i=0; i< book_list.length; ++i)
		{
			System.out.printf("%s\t %s\t %s\t %s\t %d \n",book_list[i].isbn, book_list[i].title,
														  book_list[i].auth, book_list[i].comp, 
														  book_list[i].price);
		}
		System.out.println(s_line);
	}
}
