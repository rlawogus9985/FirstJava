package com.bit.arrays;

import java.util.ArrayList;

public class ArrayList_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<UserDef> arrDef = new ArrayList<UserDef>();

		// 객체도 예약만하고 생성하지 않은 상태
		UserDef userDef; // null : 아무것도 아닌, 알수 없는 값
		for (int i = 0; i < 10; i++) {
			userDef = new UserDef();
			userDef.strName = Integer.toString(i) + "번째 학생";
			userDef.intAge = i + 10;
			arrDef.add(userDef);

		}

		for (int i = 0; i < 10; i++) {
			UserDef u = arrDef.get(i);
			System.out.print(u.strName);
			System.out.println(u.intAge);
		}

		for (int i = 0; i < 10; i++) {
			String strName = arrDef.get(i).strName;
			int intAge = arrDef.get(i).intAge;
			System.out.print(strName);
			System.out.println(intAge);
		}
		
		// ArrayList.size() : 현재까지 추가된 배열의 개수를 알려주는 method
		for (int i = 0; i<arrDef.size(); i++) {
			System.out.print(arrDef.get(i).strName);
			System.out.println(arrDef.get(i).intAge);
		}
	}

}
