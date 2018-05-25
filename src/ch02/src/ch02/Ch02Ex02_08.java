package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String input1= scanner.nextLine();
		String input2= scanner.nextLine();
		String input3= scanner.nextLine();
		float num1 = Float.parseFloat(input1);
		float num2 = Float.parseFloat(input2);
		
		System.out.printf("%.2f\n", num1);
		System.out.printf("%.2f\n", num2);
		System.out.print(input3);
	}
}
