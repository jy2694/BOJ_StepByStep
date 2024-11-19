import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 카운팅 정렬은 배열의 원소 개수가 적을 때 빠르고 효율적으로 정렬할 수 있는 알고리즘이다.
 * 단, 원소 개수에 비해 각 원소값의 범위가 극단적으로 차이가 날 경우 메모리 낭비가 심할 수 있음.
 * 
 */

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int SIZE = Integer.parseInt(br.readLine());
		int[] counting = new int[10001]; //문제에서 제시된 범위인 0~10000 범위.
		StringBuilder sb = new StringBuilder();
		
		//원소를 index로 하여 counting 배열 값 증가
		for(int i = 0; i < SIZE; i ++)
			counting[Integer.parseInt(br.readLine())] ++;
		
		//출력
		for(int i = 1; i < 10001; i ++)
			while(counting[i] > 0) {
				sb.append(i).append("\n");
				counting[i]--;
			}
		System.out.println(sb);
	}
}
