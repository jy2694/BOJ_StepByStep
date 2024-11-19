import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] set = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String line = br.readLine();
		for(String l : set)
			line = line.replaceAll(l, " ");
		System.out.println(line.length());
	}
}
