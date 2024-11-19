import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt(), m = scan.nextInt(), add = scan.nextInt();
		m += add;
		if(m >= 60) {
			h += (m/60);
			m %= 60;
		}
		if(h >= 24) h %= 24;
		System.out.println(h + " " + m);
	}
}
