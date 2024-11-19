import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) break;
			boolean[] prime = new boolean[2*N+1];
			prime[0] = prime[1] = true;
			for(int i = 2; i <= Math.sqrt(prime.length); i ++) {
				if(prime[i]) continue;
				for(int j = i*i; j<prime.length; j+=i)
					prime[j]=true;
			}
			List<Integer> prime_count = new ArrayList<>();
			for(int i = N+1; i <= 2*N; i ++)
				if(!prime[i]) prime_count.add(i);
			sb.append(prime_count.size()).append("\n");
		}
		System.out.println(sb);
	}
}