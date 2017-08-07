package com.bit.vo;

// VO Value Object : 어떤 값을 저장할 용도로 만드는 class
public class GradeVO_01 {

	private String strName;
	private String strNum;
	
	private int intKor;
    private int intEng;
    private int intMath;
	
	//Source superclass
	public GradeVO_01() {
		super();
		// TODO Auto-generated constructor stub
	}
    //Source using fields
	public GradeVO_01(String strName, String strNum, int intKor, int intEng, int intMath) {
		super();
		this.strName = strName;
		this.strNum = strNum;
		this.intKor = intKor;
		this.intEng = intEng;
		this.intMath = intMath;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrNum() {
		return strNum;
	}

	public void setStrNum(String strNum) {
		this.strNum = strNum;
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

	public int getIntMath() {
		return intMath;
	}

	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}

	

}
