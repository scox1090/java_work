package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		for(;;) {
			num = sc.nextInt();
			if(num == -1) {
				break;
			} else if(num%3==0) {
				System.out.println(num/3);
			}
		}
	
	}
}
