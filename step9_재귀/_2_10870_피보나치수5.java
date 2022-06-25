package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_10870_피보나치수5 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        System.out.println(fibonacci(Integer.parseInt(br.readLine())));
    }

    public static int fibonacci(int n) {
        if(n <= 1) return n;
        return fibonacci(n-2) + fibonacci(n-1);
    }
}
