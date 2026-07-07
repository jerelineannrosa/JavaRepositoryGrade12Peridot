package Algorithm;

public class BacktrackingAlgorithm {
    
    static char[][] maze = {
        {'S', '.', '#'},
        {'.', '.', '#'},
        {'#', '.', 'E'}
    };

    public static void main(String[] args) {

        System.out.println("Activity #3 - Backtracking Algorithm\n");

        if (solve(0, 0)) {
            System.out.println("\nPath Found!");
        } else {
            System.out.println("\nNo Path Found!");
        }
    }

    static boolean solve(int row, int col) {

        // Check if outside the maze or hit a wall
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || maze[row][col] == '#')
            return false;

        // Exit found
        if (maze[row][col] == 'E') {
            System.out.println("Reached the Exit!");
            return true;
        }

        // Already visited
        if (maze[row][col] == 'V')
            return false;

        // Visit current cell
        System.out.println("Visiting (" + row + ", " + col + ")");
        maze[row][col] = 'V';

        // Try all possible directions
        if (solve(row + 1, col) ||
            solve(row - 1, col) ||
            solve(row, col + 1) ||
            solve(row, col - 1))
            return true;

        // Backtrack if no path works
        System.out.println("Backtracking from (" + row + ", " + col + ")");
        maze[row][col] = '.';

        return false;
    }
}
