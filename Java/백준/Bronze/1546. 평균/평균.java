import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        double[] arr = new double[N];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < N; i++) arr[i] = Double.parseDouble(input[i]);
        double max = Arrays.stream(arr).max().getAsDouble();
        for(int i = 0; i < N; i ++) arr[i] = arr[i] / max * 100.0;
        System.out.println(Arrays.stream(arr).average().getAsDouble());
    }
}