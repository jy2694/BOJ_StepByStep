import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] remainder = new int[42];
        for(int i = 0; i < 10; i ++){
            remainder[Integer.parseInt(br.readLine()) % 42] ++;
        }
        System.out.println(Arrays.stream(remainder).filter(i -> i != 0).count());
    }
}