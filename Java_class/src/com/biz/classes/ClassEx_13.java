package com.biz.classes;

import com.biz.classes.model.Bank_VO;

public class ClassEx_13 
{
	public static void main(String[] args) 
   {
		Bank_VO[] bank_list = new Bank_VO[5];
		String[] str_num = new String[] {"2020-05-01","2020-05-02","2020-05-03","2020-05-04","2020-05-05"};
	
		for(int i=0; i<bank_list.length; ++i)
			bank_list[i] = new Bank_VO();
		
		for(int i=0; i<bank_list.length; ++i)
		{
			bank_list[i].setNum("001");
			bank_list[i].setDate(str_num[i]);
		}
		
		for(int i=0; i<bank_list.length; ++i)
		{
			if(bank_list[i].getDate() == str_num[0] || bank_list[i].getDate() == str_num[2])
				bank_list[i].setInput(5000);
			
			if(bank_list[i].getDate() == str_num[1] || bank_list[i].getDate() == str_num[3] || bank_list[i].getDate() == str_num[4])
				bank_list[i].setOuput(1000);
		}
  }
}
