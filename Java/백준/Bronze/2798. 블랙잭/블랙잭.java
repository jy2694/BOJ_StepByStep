import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()),
				M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] card = new int[N];
		for(int i = 0; i < N; i ++)
			card[i] = Integer.parseInt(st.nextToken());
		int max = 0;
		for(int x = 0 ; x < N; x ++) {
			for(int y = 0; y < N; y ++) {
				if(x == y) continue;
				for(int z = 0; z < N; z ++) {
					if(z == x || z == y) continue;
					if(card[x] + card[y] + card[z] <= M
							&& card[x] + card[y] + card[z] > max) {
						max = card[x] + card[y] + card[z];
					}
				}
			}
		}
		System.out.println(max);
	}
}