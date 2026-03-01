class RatMaze {
    static int N = 4;

    static boolean solve(int maze[][], int x, int y, int sol[][]) {
        if (x == N - 1 && y == N - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1) {
            sol[x][y] = 1;

            if (solve(maze, x + 1, y, sol)) return true;
            if (solve(maze, x, y + 1, sol)) return true;

            sol[x][y] = 0; // backtrack
            return false;
        }
        return false;
    }

    static void print(int sol[][]) {
        for (int[] row : sol) {
            for (int cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int sol[][] = new int[N][N];

        if (!solve(maze, 0, 0, sol))
            System.out.println("No solution");
        else
            print(sol);
    }
}
