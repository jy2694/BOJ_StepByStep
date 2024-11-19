import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r = 0, n = scan.nextInt();
		for(int i = 1; i <= n; i ++) r+=i;
		System.out.println(r);
	}
}