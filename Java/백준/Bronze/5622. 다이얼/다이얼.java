import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int result = 0;
		for(char c : line.toCharArray())
			if(c-'A' <= 2) result+=3;
			else if(c-'D' <= 2) result += 4;
			else if(c-'G' <= 2) result += 5;
			else if(c-'J' <= 2) result += 6;
			else if(c-'M' <= 2) result += 7;
			else if(c-'P' <= 3) result += 8;
			else if(c-'T' <= 2) result += 9;
			else if(c-'W' <= 3) result += 10;
		System.out.print(result);
	}
}