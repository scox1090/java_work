package ch04;

import java.util.Scanner;

public class Ch04Ex01_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float input = sc.nextFloat();
		// 0 이상 4.5이하의 평점 입력
		int a = 0;
		a = (int) input;

		switch(a) {
		case 4  : System.out.println("scholarship");
					  break;
		case 3  : System.out.println("next semester");
					  break;
		case 2  : System.out.println("seasonal semester");
					  break;
		case 1  : System.out.println("retake");
				 	  break;
		case 0  : System.out.println("retake");
					  break;	
		}
	}
}
