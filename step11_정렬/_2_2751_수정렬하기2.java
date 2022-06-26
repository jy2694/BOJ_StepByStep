package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2_2751_수정렬하기2 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] array = new int[N];
        for(int i = 0; i < N; i ++) array[i] = Integer.parseInt(br.readLine());
        Arrays.sort(array);
        for(int i : array) sb.append(i).append("\n");
        System.out.println(sb);
    }
}
