import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		if(a == b && b == c) 
			System.out.println(10000 + (a * 1000));
		else if(a == b || b == c )
			System.out.println(1000 + (b * 100));
		else if(a == c)
			System.out.println(1000 + (c * 100));
		else {
			if(a > b && a > c) {
				System.out.println(a * 100);
			} else {
				if(b > c && b > a)
					System.out.println(b * 100);
				else
					System.out.println(c * 100);
			}
		}
	}
}