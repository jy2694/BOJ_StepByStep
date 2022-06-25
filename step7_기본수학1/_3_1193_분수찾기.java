package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_1193_분수찾기 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int i = 0;
        while(!((i-1)*i/2 <= N && N <= (i+1)*i/2))
            i++;
        int n = N-(i-1)*i/2;
        if(i%2==1) {
            System.out.print((i+1-n) + "/" + n);
        } else {
            System.out.print(n + "/" + (i+1-n));
        }
    }
}
