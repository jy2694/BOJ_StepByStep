import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        char[][] array = new char[5][15];
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                array[i][j] = line.charAt(j);
            }
        }
        for(int j = 0; j < 15; j++){
            for(int i = 0; i < 5; i++){
                if(array[i][j] == '\0') continue;
                System.out.print(array[i][j]);
            }
        }
    }
}