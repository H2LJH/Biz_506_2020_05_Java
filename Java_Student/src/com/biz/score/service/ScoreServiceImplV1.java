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
	public void inputStudent() {
		
		String studentFile = "Java_Student\\src\\com\\biz\\student\\exec\\student.txt";
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
				vo.setNum(students[0]);
				vo.setName(students[1]);
				vo.setGrade((Integer.valueOf(students[2])));
				vo.setDept((students[4]));
				studentList.add(vo);
			}
	
			
			buffer.close();
			fileReader.close();						
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	@Override
	public void inputScore() 
	{
		String studentFile = "Java_Student\\src\\com\\biz\\student\\exec\\score.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;
		int index = 0;
		try
		{
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";  
			
			while(true)
			{
				reader = buffer.readLine();
				
				if(reader == null || index == 30)
					break;
				 
				students = reader.split(":");

				studentList.get(index).setKor((Integer.valueOf(students[1])));
				studentList.get(index).setEng(Integer.valueOf(students[2]));
				studentList.get(index).setMath((Integer.valueOf(students[3])));
				index++;
			}
			
			buffer.close();
			fileReader.close();						
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}

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
	public void scoreList() {

		System.out.println("=================================================");
		System.out.println("\t 학생 정보 ");
		System.out.println("=================================================");
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("=================================================");
		for(StudentVO one : studentList)
		{
			System.out.print(one.getNum()  + "\t" + 
							 one.getName() + "\t" + 
							 one.getKor()  + "\t" + 
							 one.getEng()  + "\t" +
							 one.getMath() + "\t" +
							 one.getSum()  + "\t" +
							 one.getAvg()  + "\n");
			System.out.println("=============================================");
		}

	}

	
}