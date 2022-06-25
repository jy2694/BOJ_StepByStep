package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_2577_숫자와개수 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] count = new int[10];

        int number = 1;
        for(int i = 0; i < 3; i ++)
            number *= Integer.parseInt(br.readLine());

        for(char c : Integer.toString(number).toCharArray())
            count[c-'0']++;

        for(int i = 0; i < 10; i ++)
            sb.append(count[i]).append('\n');

        System.out.println(sb);
    }
}
