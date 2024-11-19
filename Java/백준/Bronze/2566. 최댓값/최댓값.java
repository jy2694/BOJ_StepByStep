import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int max = -1;
        int[] coordinate = new int[2];
        for(int i = 0; i < 9; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 9; j ++){
                int num = Integer.parseInt(st.nextToken());
                if(max < num){
                    max = num;
                    coordinate[0] = i + 1;
                    coordinate[1] = j + 1;
                }
            }
        }
        System.out.print(max + "\n" + coordinate[0] + " " + coordinate[1]);
    }
}