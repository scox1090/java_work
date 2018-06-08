package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num1 = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
//		정수 2개 입력
		
		if(num1 >= num2)
			System.out.println(num1 - num2);
		else
			System.out.println(num2 - num1);
	}
}
