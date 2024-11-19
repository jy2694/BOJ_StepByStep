import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int a = reverse(Integer.parseInt(input[0]));
        int b = reverse(Integer.parseInt(input[1]));
        if(a > b) System.out.println(a);
        else System.out.println(b);
    }

    public static int reverse(int number){
        int result = 0;
        int divisor = 1;
        while(divisor <= 100){
            int n = (number%(divisor*10))/divisor;
            result += (100/divisor)*n;
            divisor *= 10;
        }
        return result;
    }
}