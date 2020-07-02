package com.biz.score;

import java.util.List;

public class ScoreVO 
{
	private int number;
	private int kor;
	private int eng;
	private int math;
	private float sum;
	private float avg;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getKor() {
		return kor;
	}
	public boolean setKor(int kor) 
	{
		if(kor < 0 || kor > 100)
			return false;
		
		this.kor = kor;
		return true;
	}
	public int getEng() {
		return eng;
	}
	public boolean setEng(int eng) {
		
		if(eng < 0 || eng > 100)
			return false;
		
		this.eng = eng;
		return true;
	}
	public int getMath() {
		return math;
	}
	public boolean setMath(int math) {
		if(math < 0 || math > 100)
			return false;
		
		this.math = math;
		return true;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	

}

