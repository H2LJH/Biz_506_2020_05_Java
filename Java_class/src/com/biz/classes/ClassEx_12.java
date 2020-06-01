package com.biz.classes;

import com.biz.classes.model.Bank_VO;

public class ClassEx_12 
{
	public static void main(String[] args) 
	{
		Bank_VO[] bank_list = new Bank_VO[5];
		String[] str_num = new String[] {"001","002","003","004","005"};
		
			for(int i=0; i<bank_list.length; ++i)
				bank_list[i] = new Bank_VO();
			
			for(int i=0; i<bank_list.length; ++i)
			{
				bank_list[i].setNum(str_num[i]);
				bank_list[i].setDate("6월 1일");
			}
			
			bank_list[0].setInput(5000);
			bank_list[2].setInput(5000);
			
			bank_list[1].setOuput(1000);
			bank_list[3].setOuput(1000);
			bank_list[4].setOuput(1000);
		
		
	}
}
