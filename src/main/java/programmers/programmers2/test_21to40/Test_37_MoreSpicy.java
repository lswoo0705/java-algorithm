package programmers.programmers2.test_21to40;

import java.util.PriorityQueue;

public class Test_37_MoreSpicy {
    public int solution(int[] scoville, int K) {
        int mixCount = 0;

        // 큐에 모든 스코빌 지수를 삽입
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : scoville) {
            pq.add(n);
        }

        // 가장 맵지 않은 음식의 스코빌 지수가 K 이상이 될 때까지
        while (pq.size() > 1 && pq.peek() < K) {
            int firstMin = pq.poll();
            int secondMin = pq.poll();
            int newScoville = firstMin + (secondMin * 2);
            pq.add(newScoville);
            mixCount++;
        }

        // 큐의 최상단이 K 이상인지 확인
        if (pq.peek() < K) {
            return -1;
        }

        return mixCount;
    }
}
