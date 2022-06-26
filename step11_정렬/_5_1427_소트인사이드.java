package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5_1427_소트인사이드 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[] line = br.readLine().toCharArray();
        Integer[] array = new Integer[line.length];
        for(int i = 0; i < line.length; i ++) array[i] = (line[i]-'0');
        Arrays.sort(array,(x, y)->y-x);
        for(int i : array) sb.append(i);
        System.out.println(sb);
    }
}
