package com.biz.word.service;

public interface WordGameService 
{
	public void loadWord(); // txt파일 읽어서 wordlist 만들기
	
	public void playgame(); // 구현부분
	
	public void gameover(); // 점수판
}
