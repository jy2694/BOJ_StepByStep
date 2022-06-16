package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9_2438_별찍기_1 {
	
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		for(int i = 1; i <= T; i ++) {
			for(int j = 0; j < i; j ++)
				sb.append('*');
			sb.append('\n');
		}
		System.out.print(sb);
	}

}
