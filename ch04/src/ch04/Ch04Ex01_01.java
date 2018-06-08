package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//정수 하나 입력
		int num = sc.nextInt();
		System.out.println(num);
		if (num <= 0)
			System.out.println("minus");
	}
}
