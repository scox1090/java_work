package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_01 {
public static void main(String[] args) {
	String[] Alphabet = new String[10];
	Scanner sc = new Scanner(System.in);
	String[] input = sc.nextLine().split(" ");
	for(int i=0;i<Alphabet.length;i++){
		Alphabet[i] = input[i];
	}
	for(int i=0;i<Alphabet.length;i++){
		System.out.print(Alphabet[i]);
	}
}
}
