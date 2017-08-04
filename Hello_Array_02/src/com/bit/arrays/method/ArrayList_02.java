package com.bit.arrays.method;

import java.util.ArrayList;

public class ArrayList_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<UserValue> vList = new ArrayList<UserValue>();
		
		for(int i = 0; i < 10 ; i ++) {
			vList.add(new UserValue());
		}
		
		//향상된 for
		//                     이 수의 개수를 자동으로 읽어서
		//             보냄
		for( UserValue uItem : vList) {
			String strName = uItem.getStrName();
			String strTel = uItem.getStrTel();
			int intAge = uItem.getIntAge();
		}
		
		int[] num = new int[] {1,2,3,12,253,24,1242};
		
		for(int n : num) {
			System.out.println(n);
		}
	}

}
