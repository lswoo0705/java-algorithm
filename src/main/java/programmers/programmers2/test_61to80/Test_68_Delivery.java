package programmers.programmers2.test_61to80;

import java.util.*;

public class Test_68_Delivery {
    public int solution(int N, int[][] road, int K) {
        // 그래프 초기화
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 도로 정보 저장 (양방향)
        for (int[] r : road) {
            int a = r[0], b = r[1], c = r[2];
            graph.get(a).add(new int[]{b, c});
            graph.get(b).add(new int[]{a, c});
        }

        // 최단 거리 배열 초기화 (무한대 값으로 초기화)
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0; // 1번 마을의 거리는 0

        // 우선순위 큐 사용 (최소 거리 기준으로 정렬)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{1, 0}); // {마을 번호, 현재까지 거리}

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int now = curr[0], nowDist = curr[1];

            // 현재 마을까지의 거리가 이미 저장된 최단 거리보다 크다면 무시
            if (nowDist > dist[now]) continue;

            // 현재 마을과 연결된 다른 마을 탐색
            for (int[] next : graph.get(now)) {
                int nextVillage = next[0], cost = next[1];

                // 새로운 최단 거리 계산
                int newDist = nowDist + cost;
                if (newDist < dist[nextVillage]) {
                    dist[nextVillage] = newDist;
                    pq.offer(new int[]{nextVillage, newDist});
                }
            }
        }

        // K 이하의 거리인 마을 개수 카운트
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (dist[i] <= K) count++;
        }

        return count;
    }
}
