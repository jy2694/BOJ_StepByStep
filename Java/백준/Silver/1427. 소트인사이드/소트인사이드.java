import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] line = br.readLine().toCharArray();
		Integer[] array = new Integer[line.length];
		for(int i = 0; i < line.length; i ++) array[i] = (line[i]-'0');
		Arrays.sort(array,(x,y)->y-x);
		for(int i : array) sb.append(i);
		System.out.println(sb);
	}
}