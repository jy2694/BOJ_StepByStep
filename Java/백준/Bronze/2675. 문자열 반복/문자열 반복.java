import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i ++){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            for(char c : input[1].toCharArray()){
                for(int j = 0; j < a; j ++){
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}