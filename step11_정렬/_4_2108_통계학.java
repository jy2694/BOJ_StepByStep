package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_2108_통계학 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int mean=0, median=10000, mode=10000, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        int N = Integer.parseInt(br.readLine());
        int[] counting = new int[8001];
        int count = 0;
        int mode_max = 0;
        boolean tf = false;
        for(int i = 0; i < N; i ++) {
            int value = Integer.parseInt(br.readLine());
            mean += value;
            counting[value+4000] ++;
            if(max < value) max = value;
            if(min > value) min = value;
        }
        mean = (int)Math.round((double)mean/N);
        for(int i = min; i <= max; i ++) {
            if(counting[i+4000] > 0) {
                if(count < (N/2)+1) {
                    count += counting[i+4000];
                    median = i;
                }
            }
            if(mode_max < counting[i+4000]) {
                mode_max = counting[i+4000];
                mode = i;
                tf = true;
            } else if(mode_max == counting[i+4000] && tf) {
                mode = i;
                tf = false;
            }
        }
        System.out.println(mean + "\n" + median + "\n" + mode + "\n" + (max-min));
    }
}
