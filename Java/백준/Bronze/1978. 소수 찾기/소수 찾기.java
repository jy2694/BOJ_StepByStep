import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int result = 0;
		while(st.hasMoreTokens())
			if(isPrime(Integer.parseInt(st.nextToken())))
				result++;
		System.out.println(result);
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		double sqrt = Math.sqrt(n);
		for (var i = 2; i <= sqrt; i++) 
			if (n % i == 0) return false;
		return true;
	}
}
