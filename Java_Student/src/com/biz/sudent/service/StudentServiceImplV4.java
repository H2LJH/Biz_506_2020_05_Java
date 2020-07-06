package com.biz.sudent.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV4 extends StudentServiceImplV2 
{
	public StudentServiceImplV4() {
		 outPut = System.out;
	}

	@Override
	public boolean inputStudent() 
	{		
		String studentFile = "src/com/biz/student/exec/studentList.txt";
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
				{
					break;
				}
				
				System.out.println(reader);
				// 읽어들인 라인을 분해하여 학생정보로 변환
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
		
		return true;
	}
	
}
