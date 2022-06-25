package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1_10818_최소최대 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[n];
        for(int i = 0; i < n; i ++)
            array[i] = Integer.parseInt(st.nextToken());

        int max = 0;
        for(int i = 0; i < n; i ++)
            if(array[i] > max)
                max = array[i];

        int min = max;
        for(int i = 0; i < n; i ++)
            if(array[i] < min)
                min = array[i];

        System.out.println(min + " " + max);
    }
}
