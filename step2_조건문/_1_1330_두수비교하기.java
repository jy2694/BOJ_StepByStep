package step2;

import java.util.Scanner;

public class _1_1330_두수비교하기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a < b) System.out.println("<");
		else if(a > b) System.out.println(">");
		else System.out.println("==");
	}
}
