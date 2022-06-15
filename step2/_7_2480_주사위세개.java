package step2;

import java.util.Scanner;

public class _7_2480_주사위세개 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if(a == b && a == c) {
			System.out.println(10000 + a * 1000);
		} else if(a == b || a == c) {
			System.out.println(1000 + a * 100);
		} else if(b == c) {
			System.out.println(1000 + b * 100);
		} else {
			if(a > b && a > c) {
				System.out.println(a * 100);
			} else if(b > a && b > c) {
				System.out.println(b * 100);
			} else if(c > a && c > b) {
				System.out.println(c * 100);
			}
		}
	}
}
