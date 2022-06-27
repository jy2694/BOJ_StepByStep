package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class _2_14425_문자열집합 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        List<String> list = new LinkedList<>();
        for(int i = 0; i < N; i ++) list.add(br.readLine());

        int cnt = 0;
        for(int i = 0; i < M; i ++)
            if(list.contains(br.readLine()))
                cnt++;
        System.out.println(cnt);
    }
}
