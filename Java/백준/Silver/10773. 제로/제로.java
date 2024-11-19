import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int T = scan.nextInt();
		for(int i = 0; i < T; i ++) {
			int n = scan.nextInt();
			if(n != 0) {
				stack.push(n);
			} else stack.pop();
		}
		int sum = 0;
		for(int i = 0; i < stack.size(); i ++)
			sum += stack.get(i);
		System.out.println(sum);
	}

}
