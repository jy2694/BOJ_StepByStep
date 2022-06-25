package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1_10872_팩토리얼 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }

    public static int factorial(int n) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
}
