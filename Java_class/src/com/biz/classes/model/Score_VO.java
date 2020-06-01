package com.biz.classes.model;

/* 								 --- class 작성 목적 ---
 *  다양한 type의 변수 선언 하고 한개의 인스턴스를 통해 접근하여 한개의 변수인것 처럼 사용하기 위해서
 *  
 *   						--- VO(value object) class ---
 *  method에게 보낼 매개변수가 많을 경우 일일이 매개변수를 개별적으로 전달하는 것 보다는
 *  매개변수들을 모은 클래스를 만들고 인스턴스를 생성한 다음 변수를 담아 전달하는 것이 좋다.
 *  VO(value object) || DTO(Data Transfer object)라고 많이 부른다.
 *   
 */


public class Score_VO 
{

	private String name;
	private String num;
	
	private int ikor;
	private int ieng;
	private int iart;
	private int isci;
	private int imath;
	private int imusic;
	
	private int isum;
	private int iavg;
	
	
	public int getIart() {
		return iart;
	}
	public void setIart(int iart) {
		this.iart = iart;
	}
	public int getIsci() {
		return isci;
	}
	public void setIsci(int isci) {
		this.isci = isci;
	}
	public int getImusic() {
		return imusic;
	}
	public void setImusic(int imusic) {
		this.imusic = imusic;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public int getIkor() {
		return ikor;
	}
	public void setIkor(int ikor) {
		this.ikor = ikor;
	}
	
	public int getIeng() {
		return ieng;
	}
	public void setIeng(int ieng) {
		this.ieng = ieng;
	}
	
	public int getImath() {
		return imath;
	}
	public void setImath(int imath) {
		this.imath = imath;
	}
	
	public int getIsum() {
		return isum;
	}
	public void setIsum(int isum) {
		this.isum = isum;
	}
	
	public int getIavg() {
		return iavg;
	}
	public void setIavg(int iavg) {
		this.iavg = iavg;
	}
	

} 
