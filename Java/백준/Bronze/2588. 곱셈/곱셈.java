import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int divisor = 1;
        while(divisor <= 100){
            int x = (m%(divisor*10)) / divisor;
            System.out.println(x*n);
            divisor *= 10;
        }
        System.out.println(n*m);
    }
}