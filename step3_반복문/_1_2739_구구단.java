package step3;

import java.util.Scanner;

public class _1_2739_구구단 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1; i <= 9; i ++)
			System.out.printf("%d * %d = %d\n", n, i, n*i);
	}

}
