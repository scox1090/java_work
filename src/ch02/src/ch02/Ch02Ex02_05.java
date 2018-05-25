package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String input1= scanner.nextLine();
		String input2= scanner.nextLine();
		int w =  Integer.parseInt(input1);
		float gr =  Float.parseFloat(input2);
		float r = w * gr;
		
		System.out.println(gr + "*" + w + "=" + r);
	}
}
