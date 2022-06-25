package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_2581_소수 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int start = Integer.parseInt(br.readLine()),
                end = Integer.parseInt(br.readLine());
        int min = 10000, sum = 0;
        for(int i = start; i <= end; i ++)
            if(isPrime(i)) {
                sum+=i;
                if(min > i) min = i;
            }
        if(sum == 0) System.out.println(-1);
        else System.out.println(sum + "\n" + min);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        double sqrt = Math.sqrt(n);
        for (var i = 2; i <= sqrt; i++)
            if (n % i == 0) return false;
        return true;
    }
}
