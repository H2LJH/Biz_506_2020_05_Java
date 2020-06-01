package com.biz.classes;

import com.biz.classes.model.Address;

public class ClassEx_04 
{
	public static void main(String[] args) 
	{
		// c_addr city 맴버변수는 private 이고 패키지가 다르기 때문에 직접 접근 불가능 
		Address c_addr = new Address();
		//c_addr.city = "광주 광역시";
		
		c_addr.set_city("광주 광역시");
		
		String city = c_addr.get_city();
		c_addr.set_city("서울 특별시");
		
		System.out.println(city);
		
		
	}
}
