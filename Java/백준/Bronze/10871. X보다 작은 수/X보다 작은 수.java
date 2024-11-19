import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(scan.readLine());
		int SIZE = Integer.parseInt(st.nextToken()),
				X = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(scan.readLine());
		while(st.hasMoreTokens()) {
			int element = Integer.parseInt(st.nextToken());
			if(element < X)
				sb.append(element + " ");
		}
		System.out.println(sb);
	}
}