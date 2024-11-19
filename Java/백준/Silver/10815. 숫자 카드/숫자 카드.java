import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[N];
        for(int i = 0 ; i < N; i++) array[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(array);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            if(BS(array, target)) sb.append("1 ");
                // 이분 탐색을 해서 해당 숫자가 없는 경우
            else sb.append("0 ");
        }
        System.out.print(sb);
    }

    private static boolean BS(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int index = (left + right) / 2;
            int mid = arr[index];
            if(n < mid) right = index - 1;
            else if(n > mid) left = index + 1;
            else return true;
        }
        return false;
    }
}
