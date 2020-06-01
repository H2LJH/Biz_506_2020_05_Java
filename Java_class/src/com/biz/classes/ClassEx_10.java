package com.biz.classes;

import com.biz.classes.service.Score_service;
import com.biz.classes.model.Score_VO;

public class ClassEx_10 
{
	public static void main(String[] args) 
	{
		Score_service score_service = new Score_service();
		int ikor   = 90;
		int ieng   = 80;
		int iart   = 99;
		int isci   = 100;
		int imath  = 70;
		int imusic = 90;
		int sum = score_service.sum(ikor, ieng, iart, isci, imath, imusic);
		
		
		Score_VO score = new Score_VO();
		score.setIkor(ikor);
		score.setIeng(ieng);
		score.setIart(iart);
		score.setIsci(isci);
		score.setImath(imath);
		score.setImusic(imusic);
		sum = score_service.sum(score);
		System.out.println("총점 : " + sum);
		
	}
}
