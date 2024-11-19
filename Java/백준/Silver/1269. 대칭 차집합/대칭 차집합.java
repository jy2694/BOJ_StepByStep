import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashSet<Integer> A = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++)
            A.add(Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < M; j ++) {
            int element = Integer.parseInt(st.nextToken());
            if (A.contains(element))
                A.remove(element);
            else
                A.add(element);
        }
        System.out.println(A.size());
    }
}
