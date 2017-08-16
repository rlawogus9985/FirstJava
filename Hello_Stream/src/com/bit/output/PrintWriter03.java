package com.bit.output;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriter03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 생성할 때의 이름
		String fileName = "src/com/bit/output/data.txt";
		Scanner scanner = new Scanner(System.in);
		PrintWriter printWriter = null;
		FileWriter fileWriter = null;
		// PrintWriter는
		// 파일을 생성하기 위해서 OS에게 권한 요청
		// OS 로부터 경고, 오류를 받으면 프로그램이 멈추게 된다.
		// try catch 로 묶어 주어야 한다.
		try {
			// fileWriter는 OS에 접근이 되는 class
			// 이 클래스는 단독으로 사용할 수 있지만
			// 가급적 상위(고급) 클래스에 wrapping 해서 사용하기
			// 뒤에 옵션 true를 붙이지 않으면 새로생성
			//        true를 붙으면 append(추가)
			fileWriter = new FileWriter(fileName,true);
			printWriter = new PrintWriter(fileWriter);
			while(true) {
				System.out.println("숫자를 입력하세요");
				String strKeyIn = scanner.nextLine();
				if(strKeyIn.equals("--00")) break;
				printWriter.println(strKeyIn);
			}
			// .close를 하지 않으면 파일이 항상 열려있는 것으로 알고 다른 곳에서 열지 못하거나 read only가 될 수 있다.
			// write 하기 위해 파일을 open 하면
			// 반드시 close()로 닫아 주어야 한다.
			// OS에게 권한을 반납하는 절차
			printWriter.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 생성할 수 없습니다.");
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("파일 저장 완료");
	}

}
