package com.biz.word.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.biz.word.domain.WordVO;

/*
 *  List, AraayList 와 같은 클래스류를 Collection이라고 한다.
 *  다수의 데이터를 담을수 있는 클래스들이며 VO들을 담아서 연산을 수행하는
 *  목적으로 사용한다.
 *  
 *  Collection 클래스들은 Collections라는 클래스의 자손들이다.
 */

public class WordGameServiceV3 extends WordGameServiceimplV2 
{
	@Override
	public void playgame() // 재정의 
	{
		Scanner sc = new Scanner(System.in);
		count = 0;
		game = 0;
		while(true)
		{
			// shuffle() 사용하여 wordList를 뒤섞고 그중 0번째 위치의 값을 추출한다.
			Collections.shuffle(wordList);
			WordVO wordVO = wordList.get(0);
			
			// vo에서 영단어를 추출하여 split()으로 분해한 후 words배열에 담기
			String[] words = wordVO.getEng().split("");
			List<String> wordsList = Arrays.asList(words);
			Collections.shuffle(wordsList);
			
			System.out.println("다음 알파벳을 단어 순서의에 맞게 나열 하시오 (end : 끝)");
			System.out.println(wordsList);
			String strInput = sc.nextLine();
			
			if(wordVO.getEng().equalsIgnoreCase(strInput))
			{
				System.out.println("맞았습니다.");
				System.out.println(wordVO.getEng());
				System.out.println(wordVO.getKor());
			}
			
			else
			{
				System.out.println("아쉽네요");
			}
			
		}
	}
}
