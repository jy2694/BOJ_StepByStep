import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
       int a = Integer.parseInt(input[0]);
       int b = Integer.parseInt(input[1]);
       System.out.println(a+b);
       System.out.println(a-b);
       System.out.println(a*b);
       System.out.println(a/b);
       System.out.println(a%b);
    }
}