package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1436_영화감독숌 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;
        while(count != N) {
            num ++;
            if(Integer.toString(num).contains("666")) count ++;
        }
        System.out.print(num);
    }
}
