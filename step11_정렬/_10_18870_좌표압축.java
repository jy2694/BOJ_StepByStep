package step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10_18870_좌표압축 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[N];
        int[] sort = new int[N];
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < N; i ++) {
            array[i] = Integer.parseInt(st.nextToken());
            sort[i] = array[i];
        }
        Arrays.sort(sort);

        int rank = 0;
        for(int value : sort) {
            if(!hash.containsKey(value)) {
                hash.put(value, rank);
                rank++;
            }
        }

        for(int i : array)
            sb.append(hash.get(i) + " ");
        System.out.println(sb);
    }
}
