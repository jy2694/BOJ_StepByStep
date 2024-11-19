import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i ++) queue.offer(i);
        while(queue.size() > 1){
            queue.pop();
            queue.offer(queue.pop());
        }
        System.out.println(queue.pop());
    }
}