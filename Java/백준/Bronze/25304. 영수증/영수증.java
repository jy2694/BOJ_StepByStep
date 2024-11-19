import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int price = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int total = 0;

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            total += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if(price == total)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}