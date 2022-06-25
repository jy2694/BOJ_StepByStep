package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _4_3052_나머지 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        int number=1;

        for(int i = 0; i < 10; i ++)
            array[i] = Integer.parseInt(br.readLine()) % 42;

        Arrays.sort(array);

        int tmp = array[0];
        for(int i = 1; i < 10; i ++) {
            if(tmp != array[i]) {
                tmp = array[i];
                number ++;
            }
        }
        System.out.println(number);
    }
}
