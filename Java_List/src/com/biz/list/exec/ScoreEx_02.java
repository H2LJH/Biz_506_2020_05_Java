package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.ScoreVO;
//import com.biz.list.service.ScoreServiceV1;
import com.biz.list.service.ScoreServiceV2;

public class ScoreEx_02 
{
	public static void main(String[] args)
	{
		Random rnd = new Random();
		List<ScoreVO> scoreList = new ArrayList<>();
		
		ScoreVO scoreVO;
		for(int i = 0; i < 10; i++)
		{
			scoreVO = new ScoreVO();
			scoreVO.setNum(""+i);
			scoreVO.setKor(rnd.nextInt(100)+1);
			scoreVO.setEng(rnd.nextInt(100)+1);
			scoreVO.setMath(rnd.nextInt(100)+1);
			
			scoreList.add(scoreVO);
		}
		
		//ScoreServiceV1 sService = new ScoreServiceV1();
		//sService.scoreList(scoreList);
		
		ScoreServiceV2 sService2 = new ScoreServiceV2();
		sService2.stSum(scoreList);
		sService2.stAvg();
		sService2.scoreList();
		
	}
}
