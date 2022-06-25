package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _3_10809_알파벳찾기 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] result = new int[26];
        Arrays.fill(result, -1);
        char[] s = br.readLine().toCharArray();
        for(int i = 0; i < s.length; i ++){
            int index = s[i] - 'a';
            if(result[index] == -1)
                result[index] = i;
        }
        for(int i : result) sb.append(i + " ");
        System.out.println(sb);
    }
}
