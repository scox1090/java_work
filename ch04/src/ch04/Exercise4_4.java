package ch04;

public class Exercise4_4 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
	 for(;;) {
		 i++;
		 if(i%2==0) {
			 sum = sum - i;
			 System.out.printf("-%d ",i);
		 } else {
			 sum = sum + i;
			 System.out.printf("+%d ",i);
		 }
		 if (sum>=100) {
			 break;
		 }
	 }
	 System.out.printf("=%d",i);
	}
} // end of class
