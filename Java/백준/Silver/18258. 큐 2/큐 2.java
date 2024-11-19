import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new LinkedList<>();
        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push" -> queue.offer(Integer.parseInt(st.nextToken()));
                case "pop" -> sb.append(queue.isEmpty() ? -1 : queue.poll()).append("\n");
                case "size" -> sb.append(queue.size()).append("\n");
                case "empty" -> sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                case "front" -> sb.append(queue.isEmpty() ? -1 : queue.peek()).append("\n");
                case "back" -> sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
            }
        }
        System.out.println(sb);
    }
}