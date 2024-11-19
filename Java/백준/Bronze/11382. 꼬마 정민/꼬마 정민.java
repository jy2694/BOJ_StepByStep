import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        System.out.println(a+b+c);
    }
}