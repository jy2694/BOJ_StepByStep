import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int[] arr = new int[N];
        for(int i = 0; i < N; i ++) arr[i] = i+1;
        for(int i = 0; i < M; i ++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0])-1;
            int b = Integer.parseInt(input[1])-1;
            while(a < b) {
                int temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i ++) {
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}