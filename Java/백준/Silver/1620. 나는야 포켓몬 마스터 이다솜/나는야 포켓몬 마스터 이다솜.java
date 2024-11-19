import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> numbers = new HashMap<>();
        HashMap<Integer, String> names = new HashMap<>();
        for(int i = 1; i <= N; i ++){
            String name = br.readLine();
            numbers.put(name, i);
            names.put(i, name);
        }

        for(int i = 0; i < M; i ++){
            String input = br.readLine();
            try{
                int number = Integer.parseInt(input);
                sb.append(names.get(number)).append('\n');
            } catch(Exception e){
                sb.append(numbers.get(input)).append('\n');
            }
        }
        System.out.println(sb);
    }
}