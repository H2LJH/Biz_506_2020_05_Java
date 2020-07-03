package com.biz.book.exec;

import com.biz.book.service.BookServiceimplV1;
import com.biz.book.service.interfaceBookService;

public class BookEx_01 
{
	public static void main(String[] args) 
	{
		interfaceBookService bookService = new BookServiceimplV1();

		while(true)
		{
			if(!bookService.inpuBook())
				break;
		}
	}
}
