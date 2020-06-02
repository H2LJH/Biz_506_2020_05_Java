package com.biz.classes.model;

public class Bank_VO 
{
	private String num;  // 계좌번호
	private String date; // 날짜
	private int input; 	 // 입금액
	private int ouput;   // 출금액
	private int valace;  // 잔액
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	public int getOuput() {
		return ouput;
	}
	public void setOuput(int ouput) {
		this.ouput = ouput;
	}
	public int getValace() {
		return valace;
	}
	public void setValace() {
		this.valace = getInput() - getOuput();
	}

	
	
}
