package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5_1546_평균 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        float[] scores = new float[N];

        float max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++) {
            scores[i] = Float.parseFloat(st.nextToken());
            if(scores[i] > max)
                max = scores[i];
        }

        float avg = 0.0f;
        for(int i = 0; i < N; i ++)
            avg += scores[i]/max*100;
        avg /= N;

        System.out.println(avg);
    }
}
