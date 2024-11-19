import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> result = new LinkedList<>();

        HashSet<String> l = new HashSet<>();
        for(int i = 0; i < N; i ++)  l.add(br.readLine());

        for(int i = 0; i < M; i ++) {
            String name = br.readLine();
            if (l.contains(name))
                result.add(name);
        }

        Collections.sort(result);
        sb.append(result.size()).append('\n');
        for(String name : result)
            sb.append(name).append('\n');
        System.out.println(sb);
    }

}