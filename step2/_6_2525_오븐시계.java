package step2;

import java.util.Scanner;

public class _6_2525_오븐시계 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();
		int front = scan.nextInt();
		
		minute += front;
		
		if(minute >= 60) {
			hour += minute / 60;
			minute %= 60;
		}
		
		if(hour >= 24) {
			hour %= 24;
		}
		
		System.out.println(hour + " " + minute);
	}
}
