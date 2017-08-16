package com.bit.output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MakeGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String namesFile = "src/com/bit/output/kornames.txt";
		String gradeFile = "src/com/bit/output/grades.txt";
		
		FileReader fileReader = null;
		BufferedReader buffer = null;
		PrintWriter printWriter = null;
		
		try {
			fileReader = new FileReader(namesFile);
			buffer = new BufferedReader(fileReader);
			printWriter = new PrintWriter(gradeFile);
			
			String reader = new String();
			int intNum = 0;
			while(true) {
				reader = buffer.readLine();
				if(reader == null) break;
				
				// ++가 우선 순위로 시작(앞에 붙을때)
				String strNum = Integer.toString(++intNum);
				String strName = reader;
				
				int intKor = (int)(Math.random()*(100-50)+50);
				int intEng = (int)(Math.random()*(100-50)+50);
				int intMath = (int)(Math.random()*(100-50)+50);
				
				String strKor = Integer.toString(intKor);
				String strEng = Integer.toString(intEng);
				String strMath = Integer.toString(intMath);
				
				printWriter.print(strNum);
				printWriter.print(":");
				printWriter.print(strName);
				printWriter.print(":");

				printWriter.print(strKor);
				printWriter.print(":");

				printWriter.print(strEng);
				printWriter.print(":");

				printWriter.println(strMath);
				
			}
			printWriter.close();
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 오픈 오류");
			printWriter.close();
		/*
			buffer.close();
			fileReader.close();
*/

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("성적표 생성 완료");
		
	}

}
