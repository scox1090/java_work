package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //나이 입력
		int age = sc.nextInt();
		if(age>=20)
			System.out.println("adult");
		else
			System.out.printf("%d years later",20-age);
	}
}
