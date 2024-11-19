import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken()),
				end = Integer.parseInt(st.nextToken());
		boolean[] prime = new boolean[end+1];
		prime[0] = prime[1] = true;
		for(int i = 2; i <= Math.sqrt(prime.length); i ++) {
			if(prime[i]) continue;
			for(int j = i*i; j<prime.length; j+=i)
				prime[j]=true;
		}
		for(int i = start; i <= end; i ++)
			if(!prime[i]) sb.append(i).append("\n");
		System.out.println(sb);
	}
}
