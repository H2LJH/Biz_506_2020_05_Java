package com.biz.sudent.service;

/*
 *  Business Logic // 실제 어떤 일들을 수행하는 주요 method를 모아두는 packge
 *  				  프로젝트에서 주요 연산을 수행하는 코드를 구현할때
 *  				  Service 클래스에 구현을 한다.
 *  Service 클래는 특별한 경우가 아니면 먼저 interface를 만들어서 어떤 method를 만들것인가 디자인 하는 것이 좋다.
 *  
 */
public interface StudentService 
{
	boolean inputStudent();
	void studentList();
	

}
