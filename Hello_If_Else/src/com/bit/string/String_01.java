package com.bit.string;

public class String_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * key key - 예약어(Resolved word). 정해진 기능. key가 한정
		 * key.key - 정의어(Defined word). 점연결자로 연결. 방법에 따라 기능 무한대
		 * String으로 만든 ~~ "" 등등 - object. 프로그래머가 코딩 과정에서 생성해서 쓸수있음. user defined object
		 */
		
		String strNation = "Republic of Korea";
		System.out.println(strNation);
		
		//System.out.println(strNation);
		
		//strNation.
		//"Republic of Korea".
		System.out.println("Republic of Korea");
		
		// 문자열의 길이를 알려주는 method()
		int intLength = strNation.length();
		System.out.println(intLength);
		
	}

}
