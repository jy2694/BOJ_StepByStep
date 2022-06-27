package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class _7_11478_서로다른부분문자열의개수 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < input.length(); i ++){
            String newline = "";
            for(int j = i; j < input.length(); j ++){
                newline += input.substring(j, j+1);
                set.add(newline);
            }
        }
        System.out.println(set.size());
    }
}
