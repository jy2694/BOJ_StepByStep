import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		String[][] data = new String[N][3];
		
		for(int i = 0; i < N; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			data[i][0] = st.nextToken();
			data[i][1] = st.nextToken();
			data[i][2] = Integer.toString(i);
		}
		
		Arrays.sort(data,  new Comparator<String[]>() {
		    @Override
		    public int compare(String[] x, String[] y) {
		        int age_x = Integer.parseInt(x[0]),
		        		age_y = Integer.parseInt(y[0]),
		        		register_x = Integer.parseInt(x[2]),
		        		register_y = Integer.parseInt(y[2]);
		        if(age_x == age_y)
		        	return register_x-register_y;
		        else 
		        	return age_x-age_y;
		    }
		});
		for(String[] line : data)
			sb.append(line[0] + " " + line[1] + "\n");
		System.out.println(sb);
	}
}