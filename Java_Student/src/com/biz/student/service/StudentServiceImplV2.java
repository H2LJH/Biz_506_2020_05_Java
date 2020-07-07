package com.biz.student.service;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.biz.student.domain.StudentVO;

public class StudentServiceImplV2 extends StudentServiceImplV1 
{

	// List결과를 file에 저장
	// 데이터 결과를 파일로 저장하는 것은 결과를 영구 보관하는 목적이 있다.
	// 이러한 것을 project에서 persistance라고 한다.
	
	protected PrintStream outPut;
	
	public StudentServiceImplV2() 
	{
		String studentFile = "bin/com/biz/student/exec/StudentList.txt";
		// exception Handling
		// 파일을 작성하는 과정에서 
		// 아무리 코드를 잘 작성해도 운영체제 차원에서 발생하는 exception은 
		// 코드에서 처리가 어렵다는 것을 컴파일러가 알고 있기 때문에
		// 개발자에게 의무적으로 exception처리를 하도록 규정하고 있다.
		try 
		{
			outPut = new PrintStream(studentFile);
		} 
		catch (FileNotFoundException e) 
		{
			//e.printStackTrace();
			System.out.println(studentFile + " 파일을 만들수 없음!");
			return;
		}
		
	}
	
	@Override
	public void studentList() 
	{
		//String studentFile = "bin/com/biz/student/exec/StudentList.txt";
		// PrintStream outPut = System.out;
		
	
		
		outPut.println("===========================================");
		outPut.println("\t 성적 일람표");
		outPut.println("학번\t이름\t학년\t학과");
		outPut.println("===========================================");
		
		for(StudentVO sVO : studentList)
		{
			outPut.print(sVO.getNum() + "\t");
			outPut.print(sVO.getName() + "\t");
			outPut.print(sVO.getGrade() + "\t");
			outPut.print(sVO.getDept() + "\t\n");
		}
		outPut.println("===========================================");
		outPut.close();
	}

}
