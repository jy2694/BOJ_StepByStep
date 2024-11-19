import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] array = new int[26];
		String line = br.readLine().toUpperCase();
		for(char c : line.toCharArray())
			array[c-'A']++;
		int max = 0, tmp = array[0];
		for(int i = 1; i < 26; i ++) {
			if(array[i]>tmp) {
				max = i;
				tmp = array[i];
			} else if(array[i]==tmp) {
				max=-1;
			}
		}
		if(max==-1)System.out.println(sb.append("?"));
		else System.out.println(sb.append(Character.toString(max+'A')));
	}
}