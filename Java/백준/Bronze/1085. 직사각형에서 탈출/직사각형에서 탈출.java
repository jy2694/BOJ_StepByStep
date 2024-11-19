import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken()),
                y = Integer.parseInt(st.nextToken()),
                w = Integer.parseInt(st.nextToken()),
                h = Integer.parseInt(st.nextToken());
        int min = Math.min(Math.min(x, y), Math.min(Math.abs(w-x), Math.abs(h-y)));
        System.out.println(min);
    }
}