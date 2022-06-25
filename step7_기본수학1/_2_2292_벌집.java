package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_2292_벌집 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        if(N == 1)
            System.out.print(1);
        else {
            while(range <= N) {
                range = range + (6*count);
                count++;
            }
            System.out.print(count);
        }
    }
}
