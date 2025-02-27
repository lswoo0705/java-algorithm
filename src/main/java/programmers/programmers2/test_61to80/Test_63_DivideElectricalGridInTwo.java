package programmers.programmers2.test_61to80;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test_63_DivideElectricalGridInTwo {
    public int solution(int n, int[][] wires) {
        int minDiff = Integer.MAX_VALUE; // 최소 차이
        List<List<Integer>> graph = new ArrayList<>(); // 리스트로 그래프 저장

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 구성
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        // 모든 전선을 하나씩 끊어보며 최소 차이 계산
        for (int[] wire : wires) {
            int v1 = wire[0];
            int v2 = wire[1];

            // 간선 끊기
            graph.get(v1).remove(Integer.valueOf(v2));
            graph.get(v2).remove(Integer.valueOf(v1));

            // BFS를 통해 한쪽 네트워크 크기 탐색
            int groupSize = bfs(n, graph, v1);
            int otherSize = n - groupSize;
            minDiff = Math.min(minDiff, Math.abs(groupSize - otherSize));

            // 간선 복구 (백트래킹)
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        return minDiff;
    }

    // BFS 탐색을 이용한 네트워크 크기 계산
    private int bfs(int n, List<List<Integer>> graph, int start) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count = 1; // 송전탑 개수

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    queue.offer(neighbor);
                    visited[neighbor] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
