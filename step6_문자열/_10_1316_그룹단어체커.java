package step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_1316_그룹단어체커 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int result = 0;
        while(T-- > 0){
            if(isGroup(br.readLine()))
                result ++;
        }
        System.out.println(result);
    }

    public static boolean isGroup(String line){
        boolean[] check = new boolean[26];
        char previous = '\0';
        for(char c : line.toCharArray()){
            if(previous != c){
                if(!check[c-'a']){
                    check[c-'a']=true;
                    previous = c;
                } else return false;
            } else continue;
        }
        return true;
    }
}
