package ch04;

public class empty {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10 ; i ++) {
			sum += sum + i;
			System.out.println(sum);
		}
		System.out.println(sum);
	}
}
