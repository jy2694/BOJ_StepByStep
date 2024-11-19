import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] lines = new String[N];
		for(int i = 0; i < N; i ++) lines[i] = br.readLine();
		Arrays.sort(lines, new Comparator<String>() {
		    @Override
		    public int compare(String x, String y) {
		        if(x.length()==y.length())
		        	return x.compareTo(y);
		        else
		        	return x.length()-y.length();
		    }
		});
        sb.append(lines[0]).append("\n");
        for(int i = 1; i < N; i ++)
        	if(!lines[i].equals(lines[i-1]))
        		sb.append(lines[i]).append("\n");
		System.out.println(sb);
	}
}