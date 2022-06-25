package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_8958_OX퀴즈 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            char[] array = br.readLine().toCharArray();
            int score = 0, add = 0;
            for(char c : array){
                if(c == 'O')
                    score += ++add;
                else
                    add = 0;
            }
            sb.append(score).append('\n');
        }
        System.out.println(sb);
    }
}
