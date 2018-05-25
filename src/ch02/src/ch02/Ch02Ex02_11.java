package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);

			double  num1, num2;

			String input1= scanner.nextLine();
			String input2= scanner.nextLine();
			
			 num1 = Float.parseFloat(input1);
			 num2 = Float.parseFloat(input2);
			
		System.out.printf("%.2f %.2f %.2f", num1, num2, num1 + num2);
		}
}
