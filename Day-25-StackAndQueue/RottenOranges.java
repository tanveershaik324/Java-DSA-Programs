import java.util.*;

class Pair {
    int row, col, time;

    Pair(int r, int c, int t) {
        row = r;
        col = c;
        time = t;
    }
}

public class RottenOranges {
    public static int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;

        int m = grid.length, n = grid[0].length;

        // Initialize
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int time = 0;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {
            Pair p = q.poll();
            time = p.time;

            for (int i = 0; i < 4; i++) {
                int nr = p.row + dr[i];
                int nc = p.col + dc[i];

                if (nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    fresh--;
                    q.offer(new Pair(nr, nc, time + 1));
                }
            }
        }

        return fresh == 0 ? time : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };

        System.out.println(orangesRotting(grid));
    }
}
