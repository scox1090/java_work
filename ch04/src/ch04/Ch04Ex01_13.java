package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		// 1~12중 하나 입력('월'을 입력받음)
		
		switch(num1) {
		case 1: System.out.println("31");
		break;
		case 2 : System.out.println("28");
		break;
		case 3 : System.out.println("31");
		break;
		case 4 : System.out.println("30");
		break;
		case 5 : System.out.println("31");
		break;
		case 6 : System.out.println("30");
		break;
		case 7 : System.out.println("31");
		break;
		case 8 : System.out.println("31");
		break;
		case 9 : System.out.println("30");
		break;
		case 10 : System.out.println("31");
		break;
		case 11 : System.out.println("30");
		break;
		case 12 : System.out.println("31");
		break;
		}
	}
}
