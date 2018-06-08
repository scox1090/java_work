package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
//		정수 계속 입력(끝에 100이상의 숫자를 쓰면 멈춤)
		int num = 0, sum = 0, n = 0;
		float avg = 0;
		for (;;) {
			if (num >= 100) {
				break;
			} else {		
				num = Integer.parseInt(input[n]);
				sum += num;
				avg += num;
				++n;
			}
		}
		
		System.out.println(sum);
		System.out.printf("%.1f",avg/n);
	}
	
}
