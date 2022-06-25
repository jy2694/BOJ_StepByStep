package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5_1157_단어공부 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] count = new int[26];
        char[] line = br.readLine().toUpperCase().toCharArray();
        for(char c : line)  count[c-'A']++;
        int max = 0, tmp = count[0];
        for(int i = 1; i < 26; i ++) {
            if(count[i]>tmp) {
                max = i;
                tmp = count[i];
            } else if(count[i]==tmp) {
                max=-1;
            }
        }
        if(max==-1)System.out.println("?");
        else System.out.println(Character.toString(max+'A'));
    }
}
