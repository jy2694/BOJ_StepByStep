import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        for (int i = 0; i < 26; i++) sb.append(input.indexOf((char)(i+'a'))).append(" ");
        System.out.println(sb.toString().trim());
    }
}