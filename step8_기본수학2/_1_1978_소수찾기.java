package step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1_1978_소수찾기 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        while(st.hasMoreTokens())
            if(isPrime(Integer.parseInt(st.nextToken())))
                result++;
        System.out.println(result);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        double sqrt = Math.sqrt(n);
        for (var i = 2; i <= sqrt; i++)
            if (n % i == 0) return false;
        return true;
    }
}
