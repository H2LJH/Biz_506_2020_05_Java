package com.biz.word.exec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionEx_01 
{
	public static void main(String[] args) 
	{
		String nation = "Korea";
		
		if(nation.equalsIgnoreCase("aeroK"))
			System.out.println("ddd");
		
		String[] nations = nation.split(""); // 알파벳 단위로 분해
		List<String> words = Arrays.asList(nations); // 배열을 List형 데이터로 변환		
		
		
		/*
		 *  Wrapper class를 포함하는 List 데이터를 오름차순 정렬하는 매우 간단한 메소드이다.
		 *  Collections의 sort() method는 내부 알고리즘이 quick sort 이므로 사용하는데 아무런 제약이 없이 사용해도 된다.
		 */
		
		Collections.sort(words); 
		System.out.println(words); // 대문자는 소문자보다 앞으로 온다.
		
		Collections.shuffle(words); // List에 포함된 item들을 뒤죽박죽하게 섞는 기능을 수행한다.
		System.out.println(words);

	}
}
