package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("yard? ");
		String input1= scanner.nextLine();
		
		double num1 = Float.parseFloat(input1);
		 		
	System.out.printf("%.1fyard =%.1fcm",num1 , num1 * 91.44);
	}
}
