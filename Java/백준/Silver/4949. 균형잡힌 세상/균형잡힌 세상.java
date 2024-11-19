import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner scan = new Scanner(System.in);
		L : while(true) {
			String line = scan.nextLine();
			if(line.equalsIgnoreCase(".")) break;
			char[] array = line.toCharArray();
			Stack<Character> stack = new Stack<>();
			for(char c : array) {
				if(c == '(' || c == '[') {
					stack.add(c);
				} else if(c == ']' || c == ')'){
					if(stack.isEmpty()) {
						sb.append("no\n");
						continue L;
					} else {
						char cc = stack.get(stack.size()-1);
						if(c == ']' && cc == '[')
							stack.pop();
						else if(c == ')' && cc == '(')
							stack.pop();
						else {
							sb.append("no\n");
							continue L;
						}
					}
				}
			}
			if(!stack.isEmpty())
				sb.append("no\n");
			else 
				sb.append("yes\n");
		}
		System.out.println(sb);
	}

}
