package programmers.programmers2.test_61to80;

import java.util.PriorityQueue;

public class Test_77_DefenseGame {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        int rounds = 0;

        for (int e : enemy) {
            maxHeap.add(e);
            n -= e; // 병사 사용

            if (n < 0) { // 병사가 부족하다면
                if (k > 0 && !maxHeap.isEmpty()) { // 무적 사용 가능
                    n += maxHeap.poll(); // 가장 큰 적의 수를 무적으로 제거
                    k--;
                } else {
                    break; // 방어 불가능
                }
            }
            rounds++;
        }

        return rounds;
    }
}
