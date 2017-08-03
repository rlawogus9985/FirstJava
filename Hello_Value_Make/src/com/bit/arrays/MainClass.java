package com.bit.arrays;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5개의 사용자 정의 자료형(class)를 배열로 선언하고
		// for를 이용해서 초기화 하는 작업
		UserValue[] uV = new UserValue[5];
		for(int i = 0 ; i < uV.length; i ++) {
			uV[i] = new UserValue() ;
		}
		
		//초기화 하지 않으면 사용하지 못함
		uV[1].strAddr = "광주광역시";
		uV[1].strName = "홍길동";
		uV[1].strTel = "112";
		
		System.out.println(uV[1].strAddr);
		System.out.println(uV[1].strName);
		System.out.println(uV[1].strTel);
		
		
		
	}

}
