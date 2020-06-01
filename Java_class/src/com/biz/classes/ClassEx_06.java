package com.biz.classes;

import com.biz.classes.model.Score_VO;

public class ClassEx_06 
{
	public static void main(String[] args) 
	{
		Score_VO score1 = new Score_VO();
		Score_VO score2 = new Score_VO();
		Score_VO score3 = new Score_VO();

		score1.setNum("01");
		score2.setNum("02");
		score2.setNum("03");
		
		score1.setName("이몽룡");
		score2.setName("홍길동");
		score2.setName("성춘향");
		
		score1.setIkor(90);
		score2.setIkor(88);
		score3.setIkor(77);
		
	}
}
