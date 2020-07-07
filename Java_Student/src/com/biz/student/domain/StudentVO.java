package com.biz.student.domain;

public class StudentVO 
{
	private final int maxSubject = 3;
	private String dept; // 전공
	private String name; // 이름
	private String num; // 학번
	private int grade; // 학년
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	private String grade1;
	private String deep;
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg / maxSubject;
	}

	public int getMaxSubject() {
		return maxSubject;
	}

	public String getGrade1() {
		return grade1;
	}

	public void setGrade1(String grade1) {
		this.grade1 = grade1;
	}

	public String getDeep() {
		return deep;
	}

	public void setDeep(String deep) {
		this.deep = deep;
	}
	
	
}