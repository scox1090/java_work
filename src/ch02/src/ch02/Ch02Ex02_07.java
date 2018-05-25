package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("heght = ");
		String input= scanner.nextLine();
		int k =  Integer.parseInt(input);
		
		System.out.print("Your height is " + k + "cm");
		}
}