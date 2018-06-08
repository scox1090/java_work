package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
//		영 대문자 입력
		
		char s = input.charAt(0);
		
		if( s == 'A')
			System.out.println("Excellent");
		else if(s == 'B')
			System.out.println("good");
		else if(s == 'C')
			System.out.println("Usually");
		else if(s == 'D')
			System.out.println("Effort");
		else if(s == 'F')
			System.out.println("Failure");
		else
			System.out.println("error");
	}
}
