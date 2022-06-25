package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3_7568_덩치 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] list = new int[N][2];
        for(int i = 0; i < N; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N; i ++) {
            int rank = 1;
            for(int j = 0; j < N; j ++) {
                if(i==j) continue;
                if(list[i][0] < list[j][0] && list[i][1] < list[j][1])
                    rank++;
            }
            sb.append(rank + " ");
        }
        System.out.println(sb);
    }
}
