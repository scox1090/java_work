package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		String input1= scanner.nextLine();
		String input2= scanner.nextLine();
		String input3= scanner.nextLine();
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int num3 = Integer.parseInt(input3);
		 
		
		
	System.out.printf("sum = %d\n", num1 + num2 + num3);
	System.out.printf("avg = %d", (num1 + num2 + num3)/3);
	}
}
