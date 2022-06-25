package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9_2941_크로아티아알파벳 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        String[] set = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String line = br.readLine();
        for(String l : set)
            line = line.replaceAll(l, " ");
        System.out.println(line.length());
    }
}
