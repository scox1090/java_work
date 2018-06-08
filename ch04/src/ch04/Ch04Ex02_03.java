package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		for (;;) {
			if (num != 0) {
				num = sc.nextInt();
//				정수 하나 입력
				if (num > 0) {
					System.out.println("positive integer");
				} else if(num < 0 ){
					System.out.println("negative number");
				}
			} else {
				break;
			}
		}
	}
}
