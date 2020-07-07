package com.biz.score.service;

public interface ScoreService 
{
	public void inputStudent(); // student.txt 파일을 읽어서 studentList를 작성
	
	public void inputScore(); // score 파일을 읽어서 scoreList를 작성
	
	public void calcSum(); // 총점 계산
	
	public void calcAvg(); // 평균 계산
	
	public void scoreList(); // 학생별 과목 점수 총점 평균 출력
	
}


/*
 * ================================================================
 * 성적 일람표
 * ================================================================
 * 학번    이름    국어   영어   수학    총점    평균
 * ================================================================
 */