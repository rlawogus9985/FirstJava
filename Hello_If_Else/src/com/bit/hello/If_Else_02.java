package com.bit.hello;

public class If_Else_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num1 = 3;
		int Num2 = 4;

		boolean bCheck = true;

		// 일반 비교 연산자
		bCheck = (Num1 > Num2);

		// && : and
		// 첫째 조건
		// 둘째 조건
		// 첫째 조건과 둘째 조건이 모두 true = true
		bCheck = (Num1 == 1 && Num2 == 2);

		/*
		 * 관계연산자 AND, OR, NOT A AND B : A와 B 가 모두 참이면 참, 둘중 하나라도 거짓이면 무조건 거짓 A OR B : A와
		 * B 둘중 하나만 참이면 참, 둘 모두 거짓일 경우만 거짓 A NOT : A가 참이면 거짓, A가 거짓이면 참
		 */

		/*
		 * Java의 관계연산자 AND : && OR : || NOT : !
		 */
		// And 관계 연산자
		bCheck = (true && true); // true
		bCheck = (true && false); // false
		bCheck = (false && false); // false
		// OR 관계 연산자
		bCheck = (true || true); // true
		bCheck = (true || false); // true
		bCheck = (false || true); // true
		bCheck = (false || false); // false
		// Not 관계 연산자
		bCheck = !true; // false
		bCheck = !false; // true
	}

}
