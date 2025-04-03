package programmers.programmers2.test_61to80;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_79_CheckDistancing {
    public int[] solution(String[][] places) {
        int[] answer = new int[5];

        for (int i = 0; i < 5; i++) {
            answer[i] = checkRoom(places[i]) ? 1 : 0;
        }

        return answer;
    }

    private boolean checkRoom(String[] room) {
        List<int[]> people = new ArrayList<>();

        // 응시자 위치 저장
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (room[i].charAt(j) == 'P') {
                    people.add(new int[]{i, j});
                }
            }
        }

        // 각 응시자에 대해 거리두기 확인
        for (int[] person : people) {
            if (!bfs(person[0], person[1], room)) {
                return false;
            }
        }

        return true;
    }

    // bfs(너비 우선 탐색)을 사용해서 응시자 탐색
    private boolean bfs(int x, int y, String[] room) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[5][5];

        queue.add(new int[]{x, y, 0}); // x, y, 거리
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cx = current[0], cy = current[1], dist = current[2];

            if (dist >= 2) continue; // 맨해튼 거리 2까지만 검사

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && !visited[nx][ny]) {
                    if (room[nx].charAt(ny) == 'P') return false; // 거리두기 위반
                    if (room[nx].charAt(ny) == 'O') {
                        queue.add(new int[]{nx, ny, dist + 1});
                    }
                    visited[nx][ny] = true;
                }
            }
        }
        return true;
    }
}
