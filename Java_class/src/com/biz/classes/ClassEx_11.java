package com.biz.classes;

import com.biz.classes.model.Book_VO;
import com.biz.classes.service.Book_service;

public class ClassEx_11 
{
	public static void main(String[] args) 
	{
		// Book_VO class를 이용하여 book_list 객체 배열을 3개선언
		// 인스턴스(객체) 배열은 사용전에 각각 요소들을 한번더 생성 해주어야 한다.
		Book_VO[] book_list = new Book_VO[3];
		book_list[0] = new Book_VO();
		book_list[1] = new Book_VO();
		book_list[2] = new Book_VO();
		
		book_list[0].isbn = "001";
		book_list[0].title = "자바 입문";
		book_list[0].auth = "a씨";
		book_list[0].comp = "a출판";
		book_list[0].price = 35000;
		
		book_list[1].isbn = "002";
		book_list[1].title = "자바의 정석";
		book_list[1].auth = "b씨";
		book_list[1].comp = "b출판";
		book_list[1].price = 35001;
		
		book_list[2].isbn = "003";
		book_list[2].title = "오라클 입문";
		book_list[2].auth = "c씨";
		book_list[2].comp = "c출판";
		book_list[2].price = 35002;
		
		Book_service book_service = new Book_service();
		book_service.book_list(book_list);
		
	}
}
