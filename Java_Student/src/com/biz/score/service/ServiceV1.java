package com.biz.score.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.student.domain.StudentVO;

public class ServiceV1 implements ScoreService 
{
	List<StudentVO> scoreList;

	public ServiceV1() 
	{
		scoreList = new ArrayList<>();
		
	}
	
	public void inputStudent() {
		//주소값에 있는 경로설정
		String studentFile = "Java_Student\\src\\com\\biz\\student\\exec\\student.txt";
		// 문자열 객체 선언 및 선언
		String[] students;
		//파일 읽어오기 & 저장공간 확보를 위한 초기화
		FileReader fileReader = null;
		BufferedReader buffer = null;
		
		//try 문을 활용하여 예외 처리
		try {
			// fileReader생성자에 매개변수로 studentFile을 담는다
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			int count = 0;
			String reader = "";
			while(true) {
				//textfile을 한줄씩 읽어서 가져온다.
				
				reader = buffer.readLine();
				
				if(reader == null || count == 30) {
					break;
				}
				students = reader.split(":");
				
				StudentVO vo = new StudentVO();
				vo.setNum(students[0]);
				vo.setName(students[1]);
				vo.setGrade1(students[2]);
				vo.setDeep(students[4]);
				scoreList.add(vo);
				count++;

			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void inputScore() {
		//주소값에 있는 경로설정
		String studentFile = "Java_Student\\src\\com\\biz\\student\\exec\\score.txt";
		// 문자열 객체 선언 및 선언
		String[] students;
		//파일 읽어오기 & 저장공간 확보를 위한 초기화
		FileReader fileReader = null;
		BufferedReader buffer = null;
		int i = 0;
		int count = 0;
		//try 문을 활용하여 예외 처리
		try {
			// fileReader생성자에 매개변수로 studentFile을 담는다
			fileReader = new FileReader(studentFile);
			buffer = new BufferedReader(fileReader);
			
			String reader = "";
			
			while(true) {
				// textfile을 한줄씩 읽어서 가져온다.
				reader = buffer.readLine();
				
				if(reader == null || count == 30) {
					break;
				}
				students = reader.split(":");
				
				scoreList.get(i).setKor(Integer.valueOf(students[1]));
				scoreList.get(i).setEng(Integer.valueOf(students[2]));
				scoreList.get(i).setMath(Integer.valueOf(students[3]));
				i++;
				count++;
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void calcSum() {
		int d = 0;
		int b = 0;
		int c = 0;
		
		for(StudentVO a : scoreList ) {
			d = a.getKor();
			b = a.getEng();
			c = a.getMath();
			a.setSum(b+c+d);
		}
		
		
	}

	@Override
	public void calcAvg() 
	{	
		for(StudentVO a : scoreList) 
			a.setAvg((float)(a.getSum())/3f);
		
	}

	@Override
	public void scoreList() {
		
		System.out.println("=======================================");
		System.out.println(" 학생성적 일람표 ");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("=======================================");
		System.out.println();
		for(StudentVO a : scoreList) {
			System.out.print(a.getNum()+"\t");
			System.out.print(a.getName()+"\t");
			System.out.print(a.getKor()+"\t");
			System.out.print(a.getEng()+"\t");
			System.out.print(a.getMath()+"\t");
			System.out.print(a.getSum()+"\t");
			System.out.println(a.getAvg());
			System.out.println("=======================================");
		}
		System.out.println("주민형 코드");
	
		// TODO Auto-generated method stub
		
	}	

}