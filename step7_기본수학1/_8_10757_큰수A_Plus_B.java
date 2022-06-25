package step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _8_10757_큰수A_Plus_B {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n1 = new BigInteger(st.nextToken()),
                n2 = new BigInteger(st.nextToken());
        System.out.print(n1.add(n2));
    }
}
