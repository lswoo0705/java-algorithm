package algorithm.programmers2.test_21to40;

import java.util.LinkedList;
import java.util.Queue;

// 게임 맵 최단거리
public class Test_33_ShortestDistanceForGameMap {
    private static final int[] dx = {1, -1, 0, 0};
    private static final int[] dy = {0, 0, 1, -1};

    public int solution(int[][] maps) { // BFS(큐)로 해결하기
        // 상대진형의 좌표
        int n = maps.length;
        int m = maps[0].length;

        // 방문 여부
        boolean[][] visited = new boolean[n][m];

        // BFS 큐
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});  // {x, y, 이동 횟수}
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 상대 진영에 도착할 때 거리 반환
            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            // 4 방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny, distance + 1});
                    visited[nx][ny] = true;
                }
            }
        }

        // 상대 진영에 도착할 수 없는 경우
        return -1;
    }
}
