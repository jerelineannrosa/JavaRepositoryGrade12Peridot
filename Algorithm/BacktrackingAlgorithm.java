package Algorithm;

public class BacktrackingAlgorithm {
        public static void main(String[] args) {
        if (solve(0, 0))
            System.out.println("Path Found!");
        else
            System.out.println("No Path Found!");
    }
    static char[][] maze = {
        {'S', '.', '#'},
        {'.', '.', '#'},
        {'#', '.', 'E'}
    };

    static boolean solve(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || maze[row][col] == '#')
            return false;

        if (maze[row][col] == 'E')
            return true;

        if (maze[row][col] == 'V')
            return false;

        maze[row][col] = 'V'; // Mark as visited

        if (solve(row + 1, col) ||
            solve(row - 1, col) ||
            solve(row, col + 1) ||
            solve(row, col - 1))
            return true;

        maze[row][col] = '.'; // Backtrack
        return false;
    }
}
