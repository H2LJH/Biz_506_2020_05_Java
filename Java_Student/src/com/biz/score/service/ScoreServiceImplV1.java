package com.biz.score.service;

import com.biz.sudent.service.StudentService;
import com.biz.sudent.service.StudentServiceImplV4;

public class ScoreServiceImplV1 implements ScoreService 
{

	@Override
	public void inputStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scoreList() {
		StudentService stuV4 = new StudentServiceImplV4();
		stuV4.studentList();
		
	}

}
