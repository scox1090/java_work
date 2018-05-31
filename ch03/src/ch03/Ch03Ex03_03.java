package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();	 	//과목 점수를 입력 받음
		int num2 = scanner.nextInt();		//과목 점수를 입력 받음
		int num3 = scanner.nextInt();		//과목 점수를 입력 받음
		
		System.out.printf("%.1f",(float)(num1 + num2 + num3) / 3); // 평균을 계산함
	}
}
