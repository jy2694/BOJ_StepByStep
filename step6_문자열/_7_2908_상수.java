package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _7_2908_상수 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] A = st.nextToken().toCharArray();
        char[] B = st.nextToken().toCharArray();
        int a = 0, b = 0;
        for(int i = 0; i < 3; i++){
            a += (A[i]-'0') * Math.pow(10,i);
            b += (B[i]-'0') * Math.pow(10,i);
        }
        if(a > b) System.out.println(a);
        else System.out.println(b);
    }
}
