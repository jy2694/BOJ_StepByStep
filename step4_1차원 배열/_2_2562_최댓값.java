package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2_2562_최댓값 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] array = new int[9];
        for(int i = 0; i < 9; i ++)
            array[i] = Integer.parseInt(br.readLine());

        int max = array[0];
        int max_index = 0;

        for(int i = 1; i < 9; i ++)
            if(array[i] > max){
                max = array[i];
                max_index = i;
            }
        System.out.println(max + "\n" + (max_index+1));
    }
}
