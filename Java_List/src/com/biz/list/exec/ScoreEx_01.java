package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.list.model.ScoreVO;

public class ScoreEx_01 
{
	public static void main(String[] args) 
	{
		// 1. size() 0인 리스트를 생성
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>(); // class List 만들기
		
		// 2. class를 instance로 생성
		ScoreVO scoreVO = new ScoreVO();
		
		// 3. 인스턴스의 필드변수를 세팅
		scoreVO.setNum("001");
		scoreVO.setKor(1);
		scoreVO.setEng(1);
		scoreVO.setMath(1);
		
		// 4. 리스트에 추가
		scoreList.add(scoreVO);

		// 5. 생성되어있는 instance를 반드시 다시 초기화
		scoreVO = new ScoreVO();
		scoreVO.setNum("002");
		scoreVO.setKor(2);
		scoreVO.setEng(2);
		scoreVO.setMath(2);
		scoreList.add(scoreVO);
		
		scoreVO = new ScoreVO();
		scoreVO.setNum("003");
		scoreVO.setKor(3);
		scoreVO.setEng(3);
		scoreVO.setMath(3);
		scoreList.add(scoreVO);
		
		// 호출하기
		// 1. List index 지정후 get(index) method로 instance를 추출하여 다른 instance에 저장
		ScoreVO getScore = scoreList.get(0);
		
		// 2. 필드변수 호출
		String num = getScore.getNum();
		int kor = getScore.getKor();
		int eng = getScore.getEng();
		int math = getScore.getMath();
		
		// 전체 List 호출
		int scoreSize = scoreList.size();
		for(int i=0; i<scoreSize; ++i)
		{
			getScore = scoreList.get(i);
			System.out.print(getScore.getNum() + "\t");
			System.out.print(getScore.getKor() + "\t");
			System.out.print(getScore.getEng() + "\t");
			System.out.println(getScore.getMath());
		}
		
	}
}
