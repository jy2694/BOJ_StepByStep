package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _7_4344_평균은넘겠지 {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            float[] score = new float[Integer.parseInt(st.nextToken())];
            for(int j = 0; j < score.length; j ++)
                score[j] = Float.parseFloat(st.nextToken());
            float avg = 0.0f;
            for(int j = 0; j < score.length; j ++)
                avg += score[j];
            avg /= score.length;
            float count = 0;
            for(int j = 0; j < score.length; j ++)
                if(score[j] > avg)
                    count ++;
            sb.append(String.format("%.3f", count/score.length*100.0f) + "%\n");
        }
        System.out.print(sb);
    }
}
