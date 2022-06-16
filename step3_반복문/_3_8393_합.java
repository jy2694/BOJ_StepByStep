package step3;

import java.util.Scanner;

public class _3_8393_합 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= n ; i++)
			sum += n;
		System.out.println(sum);
	}

}
