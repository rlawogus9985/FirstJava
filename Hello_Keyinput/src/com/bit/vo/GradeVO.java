package com.bit.vo;

public class GradeVO {

	private String strNum ;
	private String strName;
	
	private int intKor;
	private int intEng;
	
	private int intTotal;
	private int intAvg;
	public GradeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GradeVO(String strNum, String strName, int intKor, int intEng) {
		super();
		this.strNum = strNum;
		this.strName = strName;
		this.intKor = intKor;
		this.intEng = intEng;

	}
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public int getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(int intAvg) {
		this.intAvg = intAvg;
	}
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", intKor=" + intKor + ", intEng=" + intEng
				+ ", intTotal=" + intTotal + ", intAvg=" + intAvg + "]";
	}
	
	
	
}
