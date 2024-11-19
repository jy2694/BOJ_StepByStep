import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] line = scan.nextLine().split(" ");
		int h = Integer.parseInt(line[0]), m = Integer.parseInt(line[1]);
		m -= 45;
		if(m < 0) {
			m = 60+m;
			h--;
		}
		if(h < 0) h = 24+h;
		System.out.println(h + " " + m);
	}	
}