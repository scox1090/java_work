package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String input1= scanner.nextLine();
		String input2= scanner.nextLine();
		float yd =  Float.parseFloat(input1);
		float in =  Float.parseFloat(input2);
		
		System.out.printf("%4.1fyd = %5.1fcm\n", yd, yd * 91.44);
		System.out.printf("%4.1fin = %5.1fcm\n", in, in * 2.54);
	}
}

