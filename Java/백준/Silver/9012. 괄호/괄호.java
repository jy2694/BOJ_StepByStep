import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		L : for(int i = 0; i < T; i ++) {
			char[] line = scan.nextLine().toCharArray();
			Stack<Character> stack = new Stack<>();
			for(char c : line) {
				if(c == '(')
					stack.push(c);
				else {
					if(stack.isEmpty()) {
						sb.append("NO").append('\n');
						continue L;
					}
					else stack.pop();
				}
			}
			if(!stack.isEmpty()) sb.append("NO").append('\n');
			else sb.append("YES").append('\n');
		}
		System.out.println(sb);
	}

}