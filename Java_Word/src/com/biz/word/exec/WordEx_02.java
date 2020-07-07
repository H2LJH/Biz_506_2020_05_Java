package com.biz.word.exec;

import com.biz.word.service.WordGameService;
import com.biz.word.service.WordGameServiceimplV1;

public class WordEx_02 
{
	public static void main(String[] args) 
	{
		WordGameService wordGame = new WordGameServiceimplV1();
		
		wordGame.loadWord();
		wordGame.playgame();
		wordGame.gameover();
	}	
}
