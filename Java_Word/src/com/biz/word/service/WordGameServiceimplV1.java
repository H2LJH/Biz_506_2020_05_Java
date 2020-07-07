package com.biz.word.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.biz.word.domain.WordVO;
import com.biz.word.statics.SplitPosition;

public class WordGameServiceimplV1 implements WordGameService
{
	List<WordVO> wordList;
	private int game = 0;
	private int count = 0;
	
	public WordGameServiceimplV1() 
	{
		wordList = new ArrayList<>();
	}

	@Override
	public void loadWord() 
	{
		String wordFile = "src/com/biz/word/exec/word.txt";
		
		FileReader fileReader = null; // 파일오픈 객체
		BufferedReader buffer = null; // 파일리더와 연동하여 파일을 읽어올때 효율저긍로 가져오기 위한 Helper class
		String tempLine = "";
		String[] arrStr;
		try 
		{
			fileReader = new FileReader(wordFile);
			buffer = new BufferedReader(fileReader);
			
			while(true)
			{
				tempLine = buffer.readLine();
				
				if(tempLine == null)
					break;
			
				arrStr = tempLine.split(":");
				WordVO vo = new WordVO();
				vo.setEng(arrStr[SplitPosition.WORD_ENG]);
				vo.setKor(arrStr[SplitPosition.WORD_KOR]);
				wordList.add(vo);
			}
			
			buffer.close();
			fileReader.close();
		}
		
		catch (FileNotFoundException e)  {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
		
	}

	@Override
	public void playgame() 
	{
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);;
		
		game = 0;
		count = 0;
		String strEng = "";
		int size = 0;
		size = wordList.size();
		while(true)
		{
			int index = rnd.nextInt(size); 
			System.out.print("다음에 해당하는 영어 단어는?(end 입력시 종료)\n");
			System.out.print(wordList.get(index).getKor() + " >> ");
			strEng = sc.nextLine();
			
			if(strEng.equalsIgnoreCase("end"))
				break;
			
			
			if(strEng.equalsIgnoreCase(wordList.get(index).getEng()))
			{
				count++;
				System.out.println("정답 입니다.");
			}
			
			else
			{
				System.out.println("아쉽네요");
				System.out.println(wordList.get(index).getEng());
			}
			game++;
		System.out.println("===========================================");
		}
		sc.close();
	}

	@Override
	public void gameover() 
	{
		System.out.println("\n===========================================");
		System.out.println("\t     GAME OVER");
		System.out.printf("\t%d 게임중 %d 게임 맞춤\n", game, count);
		System.out.println("===========================================");

	}

}
