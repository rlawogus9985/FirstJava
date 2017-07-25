package com.bit.hello.i;

public class For_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i<10 ; i++) {
			// 문자(char) ''는 ascii코드로 인식
			System.out.println('0' + i );
		}
		
		//48부터 57까지 반복하는 문장
		for(int i = '0'; i <= '9' ; i++) {
			System.out.println(i);
		}
		//65부터 90까지 반복하는 문장
		for(int i = 'A'; i <= 'Z' ; i++) {
			System.out.println(i);
		}
	}

}
