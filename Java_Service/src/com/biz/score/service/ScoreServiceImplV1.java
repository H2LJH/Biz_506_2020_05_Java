package com.biz.score.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.score.domain.ScoreVO;

/*
 *  ScoreService 클래스를 정의할떄
 *  반드시 ScoreService interface를 참조(implements)하도록 규칙을 정해 놓는다.
 *  ScoreService interface를 참조하는 클래스는 ScoreService interface에 디자인된
 *  method를 모두 implements 작성되어야 하는 규칙이 작용하게 된다.
 *  
 *  인터 페이스 : 자바 클래스의 한 형태이다
 *  			 메서드들의 원형(prototype)을 정의만 할 수 있다.
 *  			  메서드들이 할일(코드)는 구체적으로 작성할수 없다.
 *  			 모든 메서는 {} 없이 메서드에서 바로 문장이 종료 된다.
 *  			  인터페이스를 implements할 클래스에 규칙을 지정한다.
 *  			 인터페이스를 implements할 클래스는 인터페이스에 정의된
 *  			  메서드를 모두 구현해야 한다.
 *  			 인터페이스에 정의된 모든 메서드를 의무적으로 포함해야 한다.
 *  		      인터페이스에 정의된 메서드 이름을 변경하여 사용할수 없다.
 *  			 자신이 어떤 메서드를 구체적으로 만들어야하는지 알 수 있다.
 *  
 *  		    인터페이스를 implements한 클래스를 사용하는 곳에서는
 *  			지금 호출하는 method는 어떤 클래스를 사용하든 같은 이름일 것이다. 라는 기대
 *  			 지금 호출하는 method가 반드시 존재하는 method이다. 라는 기대
 *  			혹시 다른 클래스를 사용해서 객체(인스턴스)를 생성했을때 
 *  			 나머지 부분의 코드를 (거의)변경 없이 테스트, 사용이 가능 하다는 기대
 *  			
 *  		    인터페이스를 사용하므로 해서 (Service)클래스와 (Main)클래스간에 결합도는 낮아지고 응집도는 높아져서 개발생산성, 유지보수성, 등이 매우 좋아진다. 
 *  			인터페이스를 잘 디자인 해 두면, 어플리케이션을 만들어가는 과정중에 후반부로 갈수록 시간, 비용 등이 절약된다.		
 */

public class ScoreServiceImplV1 implements ScoreService 
{

	protected List<ScoreVO> scoreList;
	protected Scanner scan;
	
	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public boolean inputScore() 
	{
		ScoreVO vo = new ScoreVO();
		String strN = "";
		int intNum = 0;
		vo.setNum(strN);
		String[] strName = new String[] {"학번","국어","영어","수학"};
		System.out.println("==================");
		System.out.println("점수 입력 [end 입력시 종료]");
		System.out.println("===================");

		for(int i=0; i<vo.getMaxClassCnt()+1; ++i)
		{
			try 
			{
				System.out.printf(strName[i] + " : ");
				strN = scan.nextLine();
				
				if(strN.equals("end"))
					return false;
				
				intNum = Integer.valueOf(strN);
				if(i == 0)
					vo.setNum(strN);
				
				else if(i == 1)
					vo.setKor(intNum);
				
				else if(i == 2)
					vo.setEng(intNum);
				
				else if(i == 3)
					vo.setMath(intNum);
			} 
			
			catch (Exception e) 
			{
				System.out.println("잘못 입력 하셨습니다.");
				intNum = -1;
				if(i == 0)
					vo.setKor(intNum);
				else if(i == 1)
					vo.setEng(intNum);
				else if(i == 2)
					vo.setMath(intNum);
			}
		}
		scoreList.add(vo);
		return true;
	}

	@Override
	public void calcSum() 
	{
		for(ScoreVO one : scoreList)
			one.setSum(one.getKor() + one.getEng() + one.getMath());
	}

	@Override
	public void calcAvg() 
	{
		for(ScoreVO one : scoreList)
			one.setAvg(one.getSum() / one.getMaxClassCnt());
	}

	@Override
	public void scoreList() 
	{
		System.out.println("학생 성적 정보 ( -1 Error Code)");
		System.out.println("============================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
			for(ScoreVO one : scoreList)
			{
				System.out.print(one.getNum()  +  "\t" +
								 one.getKor()  +  "\t" +
								 one.getEng()  +  "\t" +
								 one.getMath() + "\t" +
								 one.getSum()  + " \t" +
								 one.getAvg()  + " \t\n");
			}
	}

}
