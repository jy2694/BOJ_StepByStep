package step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_1018_체스판다시칠하기 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),
                M = Integer.parseInt(st.nextToken());
        boolean[][] board = new boolean[N][M];
        for(int i = 0; i < N; i ++) {
            String line = br.readLine();
            for(int j = 0; j < M; j ++)
                board[i][j] = (line.charAt(j) == 'B' ? true : false);
        }
        int min = 64;
        for(int i = 0; i < N-7; i ++) {
            for(int j = 0; j < M-7; j ++) {
                min = Math.min(min, find(board, i, j));
            }
        }
        System.out.print(min);
    }

    public static int find(boolean[][] array, int x, int y) {
        int count = 0;
        boolean check = array[x][y];
        for(int i = x; i < x+8; i ++) {
            for(int j = y; j < y+8; j ++) {
                if(array[i][j] != check) count++;
                check = !check;
            }
            check = !check;
        }
        return Math.min(count, 64-count);
    }
}
