package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5_10250_ACM호텔 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int test = Integer.parseInt(br.readLine());
        for(int i = 0; i < test; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken()); //사용하지 않는 변수
            int N = Integer.parseInt(st.nextToken());

            if(N % H == 0) sb.append((H*100)+(N/H)).append("\n");
            else sb.append(((N%H)*100)+((N/H)+1)).append("\n");
        }
        System.out.println(sb);
    }
}
