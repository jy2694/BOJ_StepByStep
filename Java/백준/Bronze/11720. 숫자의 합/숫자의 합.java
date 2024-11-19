import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        br.readLine();
        System.out.println(Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).sum());
    }
}