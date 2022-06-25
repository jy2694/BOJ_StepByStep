package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_11720_숫자의합 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int sum = 0;
        for(int i = 0; i < N; i ++)
            sum += line.charAt(i)-'0';
        System.out.println(sum);
    }
}
