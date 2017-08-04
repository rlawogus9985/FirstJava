package com.bit.arrays;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// arrDef의 개수 = 0 인 상태
		ArrayList<UserDef> arrDef = new ArrayList<UserDef>();
		
		// class를 객체로 선언해서 사용할 준비가 된 상태
		UserDef userDef = new UserDef();
		
		userDef.strName = "홍길동";
		userDef.strTel = "112";
		userDef.intAge = 12;
		arrDef.add(userDef); // userDef 배열 개수 = 1 인 상태
		
		// 새로운 장소에 userDef를 하나 만들어라
		// 만들지 않으면 마지막에 만들것이 계속 배정된 상태로 보인다.
		userDef = new UserDef();
		userDef.strName = "이몽룡";
		userDef.strTel = "113";
		userDef.intAge = 22;
		arrDef.add(userDef); // userDef 배열 개수 = 2 인 상태
		
		userDef = new UserDef();
		userDef.strName = "장보고";
		userDef.strTel = "114";
		userDef.intAge = 33;
		arrDef.add(userDef); // userDef 배열 개수 = 3 인 상태
		
		userDef = new UserDef();
		userDef.strName = "장영실";
		userDef.strTel = "115";
		userDef.intAge = 44;
		arrDef.add(userDef); // userDef 배열 개수 = 4 인 상태
		
		userDef = new UserDef();
		userDef.strName = "임꺽정";
		userDef.strTel = "116";
		userDef.intAge = 55;
		arrDef.add(userDef); // userDef 배열 개수 = 5 인 상태
		
		System.out.println(arrDef.get(0).strName);
		System.out.println(arrDef.get(1).strName);
		System.out.println(arrDef.get(2).strName);
		System.out.println(arrDef.get(3).strName);
		System.out.println(arrDef.get(4).strName);
		
		
	}

}
