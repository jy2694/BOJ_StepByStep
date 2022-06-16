package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14_1110_더하기사이클 {
	
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		int m = n;
		int x = 0;
		do {
			int a = m / 10;
			int b = m % 10;
			m = b*10 + ((a+b)%10);
			x ++;
		}while(n != m);
		System.out.println(x);
	}

}
