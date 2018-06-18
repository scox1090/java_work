package Ch05Ex;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int tmp1 = 0, tmp2 = 0;
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		for(int i=0;i<num.length;i++){
			num[i] = Integer.parseInt(input[i]);
		}
		for(int i=0;i<num.length;i++){
			if(num[i]<100 && num[i+1]<100) {
				tmp1 = num[i]>num[i+1] ? num[i] : num[i+1];
			}else if(num[i]>=100 && num[i+1]>=100){
				tmp2 = num[i]<num[i+1] ? num[i] : num[i+1];
			}
		}
		System.out.println(tmp1 + " " + tmp2);
	}
}
