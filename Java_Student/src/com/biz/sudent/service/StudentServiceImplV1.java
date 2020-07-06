package com.biz.sudent.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService
{

	protected List<StudentVO> studentList;
	
	public StudentServiceImplV1() {
		studentList = new ArrayList<StudentVO>();
	}
	
	@Override
	public boolean inputStudent() 
	{
		Scanner sc = new Scanner(System.in);
		StudentVO vo = new StudentVO();
		String[] arrStr = new String[] {"학번","이름","전공","학년"};
		String strN = "";
		int intN = 0;
		
		for(int i = 0; i<arrStr.length; ++i)
		{
			System.out.print(arrStr[i] + " (end 입력시 종료) 입력 : ");
			strN = sc.nextLine();
			
			if(strN.equals("end"))
				return false;
			
			switch (i) 
			{
				case 0:
					vo.setNum(strN);
				break;

				case 1:
					vo.setName(strN);
				break;
				
				case 2:
					vo.setDept(strN);
				break;
				
				case 3:
					try 
					{
						intN = Integer.valueOf(strN);
						vo.setGrade(intN);
					} 
					catch (Exception e) 
					{
						System.out.println("학년 은 숫자만 입력 가능");
						System.out.println(vo.getName() + "학생 정보를 다시 입력해 주세요");
						return true;
					}
					
					if(intN < 1 && intN > 4)
					{
						System.out.println("학년은 1-4까지만 가능");
						System.out.println(vo.getName() + "학생 정보를 다시 입력해 주세요");
						return true;
					}
					
				break;
			}
		}
		System.out.println("==================================");
		studentList.add(vo);
		return true;
	}

	@Override
	public void studentList() 
	{
		System.out.println("=================================");
		System.out.println("           학생 정보");
		System.out.println("=================================");
		System.out.println("학번\t 이름\t 전공\t 학년");
		
		for(StudentVO one : studentList)
			System.out.print(one.getNum()  + "\t" + 
							 one.getName() + "\t" + 
							 one.getDept() + "\t" + 
							 one.getGrade());
		
	}
	
}
