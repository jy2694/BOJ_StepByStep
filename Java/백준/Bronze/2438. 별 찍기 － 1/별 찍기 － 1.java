import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		IntStream.range(1, N+1).forEach(i -> {
			IntStream.range(1, i+1).forEach(j -> System.out.print('*'));
			System.out.println();
		});
	}
}