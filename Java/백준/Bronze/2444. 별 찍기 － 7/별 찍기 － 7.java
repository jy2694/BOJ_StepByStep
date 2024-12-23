import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
       int N = Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder();
       for(int i = 0; i < N; i ++){
           for(int j = 0; j < N-i-1; j ++) sb.append(" ");
           for(int j = 0; j < 2*i+1; j ++) sb.append("*");
           sb.append("\n");
       }
       for(int i = N-2; i >= 0; i --){
           for(int j = 0; j < N-i-1; j ++) sb.append(" ");
           for(int j = 0; j < 2*i+1; j ++) sb.append("*");
           sb.append("\n");
       }
       System.out.println(sb.toString());
    }
}