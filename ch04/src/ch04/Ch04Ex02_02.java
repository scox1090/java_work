package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		//100이하의 정수하나 입력
		int a = 0;
		int b = 0;
		while (a <= num) {
			b++;
			a += b;
		}
		b = 1;
		while (b <= a) {

			System.out.print(b++ + " ");
		}
	}
}
