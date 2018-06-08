package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //실수 2개 입력
		String[] input = sc.nextLine().split(" ");
		Double num1 = Double.parseDouble(input[0]);
		Double num2 = Double.parseDouble(input[1]);
	
		if(num1>=4.0 && num2>=4.0)
			System.out.println("A");
		else if(num1>=3.0 && num2>=3.0)
			System.out.println("B");
		else
			System.out.println("C");
	}
}
