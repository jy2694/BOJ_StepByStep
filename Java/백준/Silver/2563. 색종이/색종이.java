import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        boolean[][] sticky = new boolean[100][100];
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            for(int j = x; j < x + 10; j ++){
                for(int k = y; k < y + 10; k ++){
                    sticky[j][k] = true;
                }
            }
        }
        int area = 0;
        for(int i = 0; i < sticky.length; i ++){
            for(int j = 0; j < sticky[i].length; j ++){
                if(sticky[i][j]){
                    area ++;
                }
            }
        }
        System.out.println(area);
    }
}