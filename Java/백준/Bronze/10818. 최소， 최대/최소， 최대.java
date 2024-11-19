import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = -1000000, min = 1000000;
		for(int i = 0; i < n; i ++) {
			int element = Integer.parseInt(st.nextToken());
			if(max < element) max = element;
			if(min > element) min = element;
		}
		System.out.println(min + " " + max);
	}
}