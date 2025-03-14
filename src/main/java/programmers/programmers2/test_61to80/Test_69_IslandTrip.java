package programmers.programmers2.test_61to80;

import java.util.*;

public class Test_69_IslandTrip {
    public int[] solution(String[] maps) {
        int rows = maps.length;
        int cols = maps[0].length();
        boolean[][] visited = new boolean[rows][cols];
        List<Integer> islandDays = new ArrayList<>();

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (maps[i].charAt(j) != 'X' && !visited[i][j]) {
                    // 새로운 섬 발견, BFS 탐색 시작
                    int totalFood = 0;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;

                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int x = curr[0], y = curr[1];
                        totalFood += maps[x].charAt(y) - '0';  // 숫자로 변환하여 합산

                        // 4방향 탐색
                        for (int[] dir : directions) {
                            int nx = x + dir[0];
                            int ny = y + dir[1];

                            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols
                                    && maps[nx].charAt(ny) != 'X' && !visited[nx][ny]) {
                                queue.offer(new int[]{nx, ny});
                                visited[nx][ny] = true;
                            }
                        }
                    }

                    islandDays.add(totalFood);
                }
            }
        }

        if (islandDays.isEmpty()) return new int[]{-1};  // 섬이 없는 경우 -1 반환

        Collections.sort(islandDays);  // 오름차순 정렬
        return islandDays.stream().mapToInt(i -> i).toArray();
    }
}
