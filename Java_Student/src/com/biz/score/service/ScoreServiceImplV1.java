package com.biz.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.StudentVO;

public class ScoreServiceImplV1  implements ScoreService
{
	List<StudentVO> studentList;

	public ScoreServiceImplV1()
	{
		studentList = new ArrayList<StudentVO>();
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
				
				if(reader == null || studentList.size() >= 30)
					break;
	 
				students = reader.split(":");

				StudentVO vo = new StudentVO();
				vo.setNum(students[0]);
				vo.setName(students[1]);
				vo.setGrade((Integer.valueOf(students[2])));
				vo.setDept((students[4]));
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
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;

		try
		{
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";  
	
			for(StudentVO one : studentList)
			{
				reader = buffer.readLine();
				 
				students = reader.split(":");

				one.setKor((Integer.valueOf(students[1])));
				one.setEng(Integer.valueOf(students[2]));
				one.setMath((Integer.valueOf(students[3])));
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
		for(StudentVO one : studentList)
			one.setSum(one.getKor() + one.getMath() + one.getEng());
	}

	
	@Override
	public void calcAvg() 
	{
		for(StudentVO one : studentList)
			one.setAvg(one.getSum());
	}

	
	@Override
	public void scoreList(String number) 
	{
		for(StudentVO one : studentList)
		{
		  if(one.getNum().equals(number))
			{
				System.out.print(one.getNum()  + "\t" + 
								 one.getName() + "\t" + 
								 one.getKor()  + "\t" + 
								 one.getEng()  + "\t" +
								 one.getMath() + "\t" +
								 one.getSum()  + "\t" +
								 one.getAvg()  + "\n");
				System.out.println("=================================================");
			}
		}
	}
	
	
	
	
	
	
	
	
}