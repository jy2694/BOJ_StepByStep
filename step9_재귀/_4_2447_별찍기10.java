package step9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4_2447_별찍기10 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[][] grid = new String[N][N];
        getGrid(grid,0,0,N);

        for(int i = 0; i < grid.length; i ++) {
            for(String l : grid[i])
                sb.append(l != null ? l : " ");
            sb.append("\n");
        }
        System.out.println(sb);
    }


    public static void getGrid(String[][] grid, int x, int y, int N){
        if(N == 1){
            grid[x][y] = "*";
            return;
        }
        for(int i = 0; i < 3; i ++)
            for(int j = 0; j < 3; j ++)
                if(!(i == 1 && j == 1))
                    getGrid(grid, x + i * (N / 3), y + j * (N / 3), N / 3);
    }
}
