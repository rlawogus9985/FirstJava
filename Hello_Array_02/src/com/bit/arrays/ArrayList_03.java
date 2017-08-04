package com.bit.arrays;

import java.util.ArrayList;

public class ArrayList_03 {

	public static void main (String[] args) {
		
		ArrayList<UserDef> arrDef = new ArrayList<UserDef>();
		
		for(int i = 0 ; i < 5 ; i ++) {
			UserDef u = new UserDef();
			arrDef.add(u);
		}
		
		for(int i = 0; i < arrDef.size();i++) {
			System.out.print(arrDef.get(i).strName);
			System.out.print(arrDef.get(i).strTel);
			System.out.println(arrDef.get(i).intAge);
			
			// i번째 저장된 UserDef의 객체가 어떤 형태인가 알려준다
			System.out.println(arrDef.get(i));
			
		}
		// 3번째에 "홍길동"이라 쓰기.
		arrDef.get(3).strName = "홍길동";
		
		Integer num = 300;
		String strNum = num.toString();
		int num1 = 300;
		String strNum1 = Integer.toString(num1);
		
	}
}
