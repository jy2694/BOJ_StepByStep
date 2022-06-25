package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_9020_골드바흐의추측 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int testcase = Integer.parseInt(br.readLine());
        String[] list = new String[testcase];
        for(int i = 0; i < testcase; i ++) {
            int num = Integer.parseInt(br.readLine());
            int n1 = 0, n2 = 10000;
            for(int n = 2; n <= (int)Math.ceil(num/2); n ++) {
                if(isPrime(n) & isPrime(num-n)) {
                    if(Math.abs(n1-n2) > Math.abs(num-n-n)) {
                        n1 = n;
                        n2 = num-n;
                    }
                }
            }
            list[i] = (n1 + " " + n2);
        }
        for(String s : list)
            sb.append(s).append("\n");
        System.out.println(sb);
    }

    public static boolean isPrime(int n) {
        for(int i = 2; i <= (int)Math.sqrt(n); i ++)
            if(n%i==0) return false;
        return true;
    }
}
