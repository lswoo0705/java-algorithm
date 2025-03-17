package programmers.programmers2.test_61to80;

import java.util.LinkedList;
import java.util.Queue;

public class Test_70_RicochetRobot {
    static class Point {
        int x, y, moves;

        Point(int x, int y, int moves) {
            this.x = x;
            this.y = y;
            this.moves = moves;
        }
    }

    public int solution(String[] board) {
        int rows = board.length;
        int cols = board[0].length();
        char[][] grid = new char[rows][cols];

        int startX = 0, startY = 0, goalX = 0, goalY = 0;
        boolean[][] visited = new boolean[rows][cols];

        // 보드 정보 저장 및 시작 위치 찾기
        for (int i = 0; i < rows; i++) {
            grid[i] = board[i].toCharArray();
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'R') {
                    startX = i;
                    startY = j;
                } else if (grid[i][j] == 'G') {
                    goalX = i;
                    goalY = j;
                }
            }
        }

        // BFS 초기화
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(startX, startY, 0));
        visited[startX][startY] = true;

        // 상, 하, 좌, 우 이동
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            // 목표 지점 도달 확인
            if (current.x == goalX && current.y == goalY) {
                return current.moves;
            }

            // 네 방향으로 이동
            for (int i = 0; i < 4; i++) {
                int nx = current.x;
                int ny = current.y;

                // 장애물이나 벽에 부딪힐 때까지 이동
                while (true) {
                    int nextX = nx + dx[i];
                    int nextY = ny + dy[i];

                    if (nextX < 0 || nextX >= rows || nextY < 0 || nextY >= cols || grid[nextX][nextY] == 'D') {
                        break;
                    }

                    nx = nextX;
                    ny = nextY;
                }

                // 방문한 적이 없으면 큐에 추가
                if (!visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new Point(nx, ny, current.moves + 1));
                }
            }
        }

        return -1; // 목표 위치에 도달할 수 없음
    }
}
