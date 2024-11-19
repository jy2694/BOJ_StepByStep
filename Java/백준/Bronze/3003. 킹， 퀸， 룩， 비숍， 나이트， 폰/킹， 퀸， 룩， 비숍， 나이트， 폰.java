
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        final int[] correct = {1, 1, 2, 2, 2, 8};
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        for(int i = 0; i < 6; i ++) {
            int exist = Integer.parseInt(stringTokenizer.nextToken());
            sb.append(correct[i]-exist + " ");
        }
        System.out.println(sb);

    }
}