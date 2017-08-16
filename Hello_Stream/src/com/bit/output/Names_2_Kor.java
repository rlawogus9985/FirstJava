package com.bit.output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Names_2_Kor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String namesFile = "src/com/bit/output/names.txt";
		String korNamesFile = "src/com/bit/output/kornames.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		PrintWriter printWriter = null;
		
		try {
			fileReader = new FileReader(namesFile);
			buffer = new BufferedReader(fileReader);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("읽기 파일을 여는데 문제 발생");
		}
		
		try {
			printWriter = new PrintWriter(korNamesFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("쓰기 파일 생성 문제 발생");
		}
		
		String reader = new String();
		
		
			try {
				while(true) {
				reader = buffer.readLine();
				if(reader == null)break;
				String[] names = reader.split(":");
				
				String korName = names[1]; //한글 이름만 추출
				
				printWriter.println(korName);
				}
				printWriter.close();
				buffer.close();
				fileReader.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 I/0 문제 발생");
				printWriter.close();
			}
		System.out.println("파일 추출 완료");
		
	}

}
