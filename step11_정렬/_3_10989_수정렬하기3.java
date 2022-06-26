package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3_10989_수정렬하기3 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int SIZE = Integer.parseInt(br.readLine());
        int[] counting = new int[10001];
        for(int i = 0; i < SIZE; i ++)
            counting[Integer.parseInt(br.readLine())] ++;
        for(int i = 1; i < 10001; i ++)
            while(counting[i] > 0) {
                sb.append(i).append("\n");
                counting[i]--;
            }
        System.out.println(sb);
    }
}
