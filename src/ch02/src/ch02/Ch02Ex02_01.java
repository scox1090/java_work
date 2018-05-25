package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String input1 = scanner.nextLine();
		int kor = Integer.parseInt (input1);
		String input2 = scanner.nextLine();
		int mat = Integer.parseInt (input2);
		String input3 = scanner.nextLine();
		int eng = Integer.parseInt (input3);
		
		int sum = kor + mat + eng;
		int avg = (kor + mat + eng) / 3;
		
		
		 System.out.printf("kor %d%n", kor);
		 System.out.printf("mat %d%n", mat);
		 System.out.printf("eng %d%n", eng);
		 System.out.printf("sum %d%n", sum);
		 System.out.printf("avg %d%n", avg);
		 
	}
}
