package com.bit.string;

public class String_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "대한민국";
		int intLength = strNation.length();
		System.out.println(strNation.length());

		// strNation.length() 와 같은 method는 for 반복문에서
		// 최소한으로 호출하는 것이 좋다
		for (int i = 0; i < strNation.length(); i++) {
			System.out.println(strNation.charAt(i));
		}

		// for 를 실행하기 전에 length를 구하고
		// 아래와 같이 사용하는 것이 효율적이다.
		for (int i = 0; i < intLength; i++) {
			System.out.println(strNation.charAt(i));
		}

		String strNation1 = "Republic of Korea";
		
		// 영문자 o가 몇번째에 있는가 모두 찾아라
		for (int i = 0 ; i < strNation1.length() ; i ++) {
			if(strNation1.charAt(i)=='o') {
				System.out.println(i + "번째에 위치");
			}
		}
		
		// 영문자 o가 최초로 발견된 위치는 어디인가
		for ( int i = 0 ; i < strNation1.length(); i ++) {
			if(strNation1.charAt(i)== 'o') {
				System.out.println(i + "번째에 위치");
				break;
			}
		}
	// 문자열로 찾을때
		for(int i = 0 ; i < strNation1.length(); i ++) {
			String s = strNation1.substring(i, i+1);
			if(s.equalsIgnoreCase("O")) {
				System.out.println(i + "번째에 위치");
			}
			
		}
		
		
		
		
	}

}
