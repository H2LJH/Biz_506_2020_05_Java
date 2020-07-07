package com.biz.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.score.config.SplitPos;
import com.biz.student.domain.ScoreVO;
import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1  implements ScoreService
{
	List<StudentVO> studentList;
	List<ScoreVO> scoreList;

	public ScoreServiceImplV1()
	{
		studentList = new ArrayList<StudentVO>();
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void inputStudent() 
	{
		String studentFile = "src/com/biz/student/exec/student.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		try
		{
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";  
			
			while(true)
			{
				reader = buffer.readLine();
				
				if(reader == null)
					break;
				
				students = reader.split(":");
				StudentVO vo = new StudentVO();
				vo.setNum(students[SplitPos.STUDENT.ST_NUM]);
				vo.setName(students[SplitPos.STUDENT.ST_NAME]);
				vo.setGrade((Integer.valueOf(students[SplitPos.STUDENT.ST_GRADE])));
				vo.setDept((students[SplitPos.STUDENT.ST_DEPT]));
				studentList.add(vo);
			}
			
			buffer.close();
			fileReader.close();						
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
	}

	
	@Override
	public void inputScore() 
	{
		String studentFile = "src/com/biz/student/exec/score.txt";
		String[] scores;
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try
		{
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";  
	
			while(true)
			{
				reader = buffer.readLine();
				
				if(reader == null)
					break;
				
				scores = reader.split(":");
				ScoreVO vo = new ScoreVO();
				vo.setNum(scores[SplitPos.SCORE.SC_NUM]);
				vo.setKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR]));
				vo.setEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
				vo.setMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));
				vo.setSum(Integer.valueOf(scores[SplitPos.SCORE.SC_SUM]));
				vo.setAvg(Float.valueOf(scores[SplitPos.SCORE.SC_AVG]));
				scoreList.add(vo);
			}
				
			buffer.close();
			fileReader.close();						
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
	}

	
	@Override
	public void calcSum() 
	{
		int sum = 0;
		for(StudentVO i : studentList)
		{
			for(ScoreVO j : scoreList)
			{
				sum = j.getKor() + j.getEng() + j.getMath();
				if(i.getName().equals(j.getNum()) && j.getSum() != sum)
					j.setSum(sum);
			}
		}
	}

	
	@Override
	public void calcAvg() 
	{
		int avg = 0;
		for(StudentVO i : studentList)
		{
			for(ScoreVO j : scoreList)
			{
				avg = j.getSum() / 3;
				if(i.getName().equals(j.getNum()) && j.getAvg() != avg)
					j.setAvg(avg);
			}
		}
	}

	
	@Override
	public void scoreList() 
	{
		for(StudentVO i : studentList)
		{
			for(ScoreVO j : scoreList)
			{
				if(i.getNum().equals(j.getNum()))
				{
					System.out.print(i.getNum()  + "\t" + 
									 i.getName() + "\t" +
									 j.getKor()  + "\t" +
									 j.getEng()  + "\t" +
									 j.getMath() + "\t" +
									 j.getSum()  + "\t" +
									 j.getAvg()  + "\n");
					System.out.println("=======================================================");
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
}