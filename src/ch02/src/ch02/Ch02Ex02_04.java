package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		String input1= scanner.nextLine();
		String input2= scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		String input3= scanner.nextLine();
		String input4= scanner.nextLine();
		int num3 = Integer.parseInt(input3);
		int num4 = Integer.parseInt(input4);
		int a = num1 - num2;
		int b = num3 - num4;
		
		System.out.println(num1 + "-" + num2 + "=" + a);
		System.out.println(num3 + "-" + num4 + "=" + b);
}
}
