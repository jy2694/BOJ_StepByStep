package step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2_4673_셀프넘버 {
    //private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        boolean[] ch = new boolean[10001];
        for(int i = 1; i <= 10000; i ++) {
            int d = d(i);
            if(d < 10001)
                ch[d] = true;
        }
        for(int i = 1; i <= 10000; i ++) {
            if(!ch[i])
                sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public static int d(int x) {
        int d = x;
        int d5 = (d/10000);
        d-=d5*10000;
        int d4 = (d/1000);
        d-=d4*1000;
        int d3 = (d/100);
        d-=d3*100;
        int d2 = (d/10);
        d-=d2*10;
        return x + d5 + d4 + d3 + d2 + d;
    }
}
