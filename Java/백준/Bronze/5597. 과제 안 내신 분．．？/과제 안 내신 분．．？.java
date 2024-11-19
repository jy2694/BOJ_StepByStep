import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean[] submit = new boolean[30];
        for(int i = 0; i < submit.length-2; i ++){
            int num = Integer.parseInt(br.readLine());
            submit[num-1] = true;
        }
        for(int i = 0; i < submit.length; i ++){
            if(!submit[i]){
                System.out.println(i+1);
            }
        }
    }
}