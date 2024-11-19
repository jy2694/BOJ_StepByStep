import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        System.out.println(Integer.parseInt(input[0]) * Integer.parseInt(input[1]));
    }
}