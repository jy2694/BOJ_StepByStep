package step1;

import java.util.Scanner;

public class _13_2588_곱셈 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int c = (b%10) * a;
		int d = ((b/10)%10) * a;
		int e = (b/100) * a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(a*b);
	}

}
