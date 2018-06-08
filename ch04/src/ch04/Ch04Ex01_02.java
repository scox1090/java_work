package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키 몸무게 입력
		int height = sc.nextInt();
		int weight = sc.nextInt();
		int BMI = weight + 100 - height;
		System.out.println(BMI);
		if(BMI >= 0)
			System.out.println("Obesity");
	}
}
