import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] result = new int[n];
        for(int a = 0; a < m; a ++){
            String[] method = br.readLine().split(" ");
            int i = Integer.parseInt(method[0]);
            int j = Integer.parseInt(method[1]);
            int k = Integer.parseInt(method[2]);
            for(int b = i-1; b < j; b ++){
                result[b] = k;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i ++){
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}