import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0, index = 0;
		for(int i = 1; i < 10; i ++) {
			int n = Integer.parseInt(br.readLine());
			if(n > max) {
				max = n;
				index = i;
			}
		}
		System.out.println(max + "\n" + index);
	}
}
