import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		int result = index;
		String[] array = new String[index];
		for(int i = 0; i < index; i ++)
			array[i] = br.readLine();
		L : for(int i = 0; i < index; i ++) {
			String line = array[i];
			for(int n = 0; n < line.length(); n ++) {
				char c1 = line.charAt(n);
				for(int j = n+1; j < line.length(); j ++) {
					char c2 = line.charAt(j);
					if(c1 == c2) {
						if(j - n == 1) {
							c1 = c2;
							n++;
							continue;
						} else {
							result--;
							continue L;
						}
					}
				}
			}
		}
		System.out.println(result);
	}
}