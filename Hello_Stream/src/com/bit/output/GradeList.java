package com.bit.output;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GradeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/bit/output/grades.txt";
		
		FileReader fileReader= null;
		
		try {
			fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String reader = new String();
			
			System.out.println("==============================");
			System.out.println("      성           적           표           ");
			System.out.println("-------------------------------");
			System.out.println("이름\t총점\t평균");
			System.out.println("-------------------------------");
			
			
			while(reader != null) {
				
				reader = buffer.readLine();
				if(reader == null) break;
				
				String[] grades = reader.split(":");
				String strNum = grades[0];
				String strName = grades[1];
				String strKor = grades[2];
				String strEng = grades[3];
				String strMath = grades[4];
				
				int sum = Integer.parseInt(strKor) + Integer.parseInt(strEng) + Integer.parseInt(strMath);
				int intTotal = sum;
				int intAvg = (sum/3);
				System.out.print(strName + "\t");
				// System.out.printf("%-10s\t",strName); 10칸 왼쪽정렬(-) strName표기(%s)
				System.out.print(intTotal + "\t");
				System.out.println(intAvg + "\t");
				
				
			}
			
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			System.out.println("파일을 여는 데 문제 발생");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는데 문제 발생");
		}
		System.out.println("===========================");
		
		
		
	}

}
