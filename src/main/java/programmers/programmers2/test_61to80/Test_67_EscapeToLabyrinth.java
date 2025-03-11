package programmers.programmers2.test_61to80;

import java.util.LinkedList;
import java.util.Queue;

public class Test_67_EscapeToLabyrinth {
    static class Point {
        int x, y, dist;
        public Point(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public int solution(String[] maps) {
        int rows = maps.length;
        int cols = maps[0].length();
        char[][] grid = new char[rows][cols];

        int startX = 0, startY = 0, leverX = 0, leverY = 0, exitX = 0, exitY = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = maps[i].charAt(j);
                if (grid[i][j] == 'S') { startX = i; startY = j; }
                if (grid[i][j] == 'L') { leverX = i; leverY = j; }
                if (grid[i][j] == 'E') { exitX = i; exitY = j; }
            }
        }

        int toLever = bfs(grid, startX, startY, leverX, leverY);
        if (toLever == -1) return -1;

        int toExit = bfs(grid, leverX, leverY, exitX, exitY);
        if (toExit == -1) return -1;

        return toLever + toExit;
    }

    private int bfs(char[][] grid, int startX, int startY, int targetX, int targetY) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        Queue<Point> queue = new LinkedList<>();

        queue.offer(new Point(startX, startY, 0));
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.x == targetX && current.y == targetY) {
                return current.dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && !visited[nx][ny] && grid[nx][ny] != 'X') {
                    visited[nx][ny] = true;
                    queue.offer(new Point(nx, ny, current.dist + 1));
                }
            }
        }
        return -1;
    }
}
