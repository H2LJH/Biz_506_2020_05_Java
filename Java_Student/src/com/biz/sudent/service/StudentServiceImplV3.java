package com.biz.sudent.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *  V2는 V1을 상속받아서 studentList() method를 재정의(Override)해 놓은 상태이다
 *  V3에서는 V2를 상속받아서 V2에 구현된 studentList() method는 그대로 사용하고
 *  V1에 있는 inputStudent() method만 재정의하여 V3를 만들겠다 라는 의미
 *  
 *  V3에서는 student.txt파일을 읽어서 
 *  학생정보를 가져오고 studentList() method를 사용하여 출력해보기
 */

public class StudentServiceImplV3 extends StudentServiceImplV2 
{

	@Override
	public boolean inputStudent() 
	{
		
		
		String studentFile = "src/com/biz/student/exec/student.txt";
		
		/*
		 *  FileReader 클래스로 fileReader 객체를 선언하고 clear 하기
		 *  문자열, 숫자 등이 아닌 정체를 알수 없는 클래스로 객체를 선언할때는 가급적 null로 clear를 시켜주는 것이 좋다.
		 */
		FileReader fileReader = null;
		
		
		/*
		 *  로컬 디스크에 저장된 파일을 읽을때 fileReader 만으로 읽을 수 있지만
		 *  파일을 읽어들이는 성능상의 이점을 주기 위해서 중간 BufferedReader를 연결하여
		 *  파일을 읽어 들이는 것이 좋다.
		 */
		
		BufferedReader buffer = null;
		
		try
		{
			// 읽어드릴 파일을 열고, 파일에 관련된 정보를 fileReader 객체에 저장
			fileReader = new FileReader(studentFile);
			
			// fileReader 객체에 정보를 buffer관리자에 전달하여 파일을 읽도록 지시
			// buffer 관리자는 파일을 몽땅 읽어서 자신이 관리하는 buffer 장치에 임시 보관
			buffer = new BufferedReader(fileReader);
			
			String reader = "";  // 문자열변수의 경우 for, while반복문내에서 계속해서 선언하는 것은 메모리 관리상 매우 좋지 않다.
								 // 따라서 문자열 변수는 반목문이 실행되기 전에 먼저 선언, clear를 하고 진행하는 것이 좋다.
			
			/*
			 파일의 라인수가 200개로 정해지고, 그 라인수를 알수 있다면 다음과 같은 코드로 충분히 처리가 가능할 것이다.
			 하지만 파일은 상황에 따라 라인수가 변동될수도 있고, 라인수를 예측하지 못하는 상황이 올수도 있다.
			 즉, 반복문을 수행해야할 횟수를 정하지 못할수도 있다.
			 이럴때는 for 반복문 보다는 while문을 사용하는 것이 좋다.
			 
			for(int i=0; i<200; i++)
			{
				reader = buffer.readLine(); 			// buffer 장치로부터 text 내용을 1줄씩 읽어 들이기
				System.out.println(reader);
			}
			*/
			
			while(true)
			{
				reader = buffer.readLine();
				
				if(reader == null)
					break;
				
				//System.out.println(reader);
			}
			
			
			
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
}
