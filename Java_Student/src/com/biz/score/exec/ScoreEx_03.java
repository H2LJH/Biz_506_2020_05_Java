package com.biz.score.exec;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;


public class ScoreEx_03 
{
	public static void main(String[] args) 
	{
		PrintWriter outPut = null; // = System.out;
		String outFile = "src/com/biz/student/exec/score.txt";
		
		// 지금 부터 outFile 변수에 저장된 파일이름으로
		// text를 기록하기 위해 파일을 만들어라
		
		try 
		{
			outPut = new PrintWriter(outFile);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		Random rnd = new Random();
		
		for(int i=0; i< 30; i++)
		{
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			int intSum = intKor+intEng+intMath;
			float floatAvg = (float)(intSum) / 3;
			
			String score = String.format("%05d:%d:%d:%d:%d: %06.2f", i+1, intKor, intEng, intMath, intSum, floatAvg);
			outPut.println(score);
		}
		outPut.close();
		System.out.println("완료");
	}
}
