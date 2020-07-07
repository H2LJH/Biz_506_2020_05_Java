package com.biz.word.statics;

/*
 *  클래스에 정의된 필드변수, method에 static 키워드가 부착이 되면 
 *  이 클래스를 static 클래스 라고 한다.
 *  
 *  Static 클래스는 초기화 과정을 수행 할 필요 없이 사용할수 있다.
 *  
 */

public class SplitPosition 
{
	public static int WORD_ENG = 0;
	public static int WORD_KOR = 1;
	
	public static void out(String str)
	{
		System.out.println(str);
	}
}
