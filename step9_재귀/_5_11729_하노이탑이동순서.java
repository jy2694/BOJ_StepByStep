package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_11729_하노이탑이동순서 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        sb.append((int)(Math.pow(2, N) - 1) + "\n");
        Hanoi(N,1,2,3);
        System.out.println(sb);
    }

    public static void Hanoi(int N, int start, int mid, int to) {
        if(N == 1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        Hanoi(N-1, start, to, mid);
        sb.append(start + " " + to + "\n");
        Hanoi(N-1,mid,start,to);
    }
}
