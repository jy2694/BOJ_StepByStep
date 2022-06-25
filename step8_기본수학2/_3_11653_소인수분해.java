package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_11653_소인수분해 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for(int i = 2; i <= Math.sqrt(N); i ++)
            while(N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        if(N != 1) sb.append(N);
        System.out.println(sb);
    }
}
