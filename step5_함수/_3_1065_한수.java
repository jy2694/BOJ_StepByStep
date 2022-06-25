package step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_1065_한수 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 1; i <= n; i ++) {
            int d1 = i;
            int d4 = d1/1000;
            d1%=1000;
            int d3 = d1/100;
            d1%=100;
            int d2 = d1/10;
            d1%=10;
            if(d4 == 0) {
                if(d3 == 0) {
                    result++;
                    continue;
                }
                if(d1-d2 == d2-d3) result++;
                continue;
            }
            if(d1-d2 == d2-d3 & d2-d3 == d3-d4) result++;
        }
        System.out.println(sb.append(result));
    }
}
