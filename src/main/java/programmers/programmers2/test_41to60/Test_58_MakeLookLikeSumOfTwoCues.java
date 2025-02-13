package programmers.programmers2.test_41to60;

import java.util.LinkedList;
import java.util.Queue;

public class Test_58_MakeLookLikeSumOfTwoCues {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        long sum1 = 0, sum2 = 0;

        // 큐에 값 넣고 합 계산
        for (int num : queue1) {
            q1.offer(num);
            sum1 += num;
        }
        for (int num : queue2) {
            q2.offer(num);
            sum2 += num;
        }

        // 전체 합이 홀수이면 나눌 수 없음
        long totalSum = sum1 + sum2;
        if (totalSum % 2 != 0) return -1;

        int moves = 0; // 이동 횟수
        int maxOperations = queue1.length * 3; // 최대 가능 연산 횟수 제한 (시간 복잡도 고려)

        // 투 포인터 탐색
        while (sum1 != sum2 && moves < maxOperations) {
            if (sum1 > sum2) { // queue1에서 pop 후 queue2에 insert
                int value = q1.poll();
                sum1 -= value;
                sum2 += value;
                q2.offer(value);
            } else { // queue2에서 pop 후 queue1에 insert
                int value = q2.poll();
                sum2 -= value;
                sum1 += value;
                q1.offer(value);
            }
            moves++;
        }

        return sum1 == sum2 ? moves : -1; // sum1 == sum2가 되면 최소 연산 횟수 반환
    }
}
