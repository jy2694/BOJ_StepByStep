import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<Integer, Integer> cnt = new HashMap<>();

        for(int i = 0; i < N; i ++) {
            int card = Integer.parseInt(st.nextToken());
            cnt.put(card, cnt.getOrDefault(card, 0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i ++)
            sb.append(cnt.getOrDefault(Integer.parseInt(st.nextToken()), 0) + " ");
        System.out.println(sb);
    }
}