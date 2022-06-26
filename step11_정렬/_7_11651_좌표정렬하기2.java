package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _7_11651_좌표정렬하기2 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] coord = new int[N][2];
        for(int i = 0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coord[i][0] = Integer.parseInt(st.nextToken());
            coord[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(coord, (x, y) -> {
            if(x[1] == y[1]) return x[0]-y[0];
            else return x[1]-y[1];
        });
        for(int[] c : coord) sb.append(c[0] + " " + c[1] + "\n");
        System.out.println(sb);
    }
}
