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
<<<<<<< HEAD
	public void inputStudent() 
	{
		String studentFile = "src/com/biz/student/exec/student.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
=======
	public void inputStudent() {
		
		String studentFile = "Java_Student\\src\\com\\biz\\student\\exec\\student.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
>>>>>>> e369461c8344791c95605052a62dad97ff150b09
		try
		{
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";  
			
			while(true)
			{
				reader = buffer.readLine();
				
<<<<<<< HEAD
				if(reader == null || studentList.size() >= 30)
=======
				if(reader == null)
>>>>>>> e369461c8344791c95605052a62dad97ff150b09
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
<<<<<<< HEAD
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
=======
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
>>>>>>> e369461c8344791c95605052a62dad97ff150b09

	}

	@Override
	public void inputScore() 
	{
<<<<<<< HEAD
		String studentFile = "src/com/biz/student/exec/score.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;
=======
		String studentFile = "Java_Student\\src\\com\\biz\\student\\exec\\score.txt";
		String[] students;
		FileReader fileReader = null;
		BufferedReader buffer = null;
		int index = 0;
>>>>>>> e369461c8344791c95605052a62dad97ff150b09
		try
		{
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			String reader = "";  
<<<<<<< HEAD
	
			for(StudentVO one : studentList)
			{
				reader = buffer.readLine();
				 
				students = reader.split(":");

				one.setKor((Integer.valueOf(students[1])));
				one.setEng(Integer.valueOf(students[2]));
				one.setMath((Integer.valueOf(students[3])));
=======
			
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
>>>>>>> e369461c8344791c95605052a62dad97ff150b09
			}
			
			buffer.close();
			fileReader.close();						
		} 
<<<<<<< HEAD
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
=======
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
>>>>>>> e369461c8344791c95605052a62dad97ff150b09

	}

	@Override
	public void calcSum() 
	{
		for(StudentVO one : studentList)
<<<<<<< HEAD
			one.setSum(one.getKor() + one.getMath() + one.getEng());
=======
		one.setSum(one.getKor() + one.getMath() + one.getEng());

>>>>>>> e369461c8344791c95605052a62dad97ff150b09
	}

	@Override
	public void calcAvg() 
	{
		for(StudentVO one : studentList)
			one.setAvg(one.getSum());
	}

	@Override
<<<<<<< HEAD
	public void scoreList(String number) {
=======
	public void scoreList() {
>>>>>>> e369461c8344791c95605052a62dad97ff150b09

		System.out.println("=================================================");
		System.out.println("\t 학생 정보 ");
		System.out.println("=================================================");
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균\t");
		System.out.println("=================================================");
		for(StudentVO one : studentList)
		{
<<<<<<< HEAD
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
=======
			System.out.print(one.getNum()  + "\t" + 
							 one.getName() + "\t" + 
							 one.getKor()  + "\t" + 
							 one.getEng()  + "\t" +
							 one.getMath() + "\t" +
							 one.getSum()  + "\t" +
							 one.getAvg()  + "\n");
			System.out.println("=============================================");
>>>>>>> e369461c8344791c95605052a62dad97ff150b09
		}

	}

	
}