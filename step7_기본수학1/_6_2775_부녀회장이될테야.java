package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _6_2775_부녀회장이될테야 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int test = Integer.parseInt(br.readLine());
        for(int n = 0; n < test; n ++) {
            int floor = Integer.parseInt(br.readLine());
            int number = Integer.parseInt(br.readLine());

            int[][] apt = new int[15][15];
            for(int i = 0; i < 15; i ++) {
                apt[i][0] = 1;
                apt[0][i] = i+1;
            }
            for(int i = 1; i < 15; i ++) {
                for(int j = 1; j < 15; j ++) {
                    apt[i][j] = apt[i-1][j] + apt[i][j-1];
                }
            }
            sb.append(apt[floor][number-1]).append("\n");
        }
        System.out.println(sb);
    }
}
