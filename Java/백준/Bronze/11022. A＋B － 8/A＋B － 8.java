import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(scan.readLine());
		for(int i = 1; i <= n; i ++) {
			String[] line = scan.readLine().split(" ");
			bw.write("Case #"+ i + ": " +
					line[0] + " + " + line[1] + " = " +
					(Integer.parseInt(line[0]) + Integer.parseInt(line[1])) + "\n");
		}
		bw.flush();
		bw.close();
	}	
}