import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 1; i <= n; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			sb.append(String.format("Case #%d: %d\n",
					i,
					Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
		}
		System.out.println(sb);
	}
}