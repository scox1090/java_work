package ch04;

public class Exercise4_5 {
	public static void main(String[] args) {
		int i=0;
		while(i<=10) {
			int j =0;
			while(j<=i) {
				j++;
			System.out.print("*");
			}
			i++;
			System.out.println();
		}
	}
}
