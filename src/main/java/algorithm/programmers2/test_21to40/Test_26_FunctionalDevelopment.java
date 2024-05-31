package algorithm.programmers2.test_21to40;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Test_26_FunctionalDevelopment {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>(); // 기능이 완료되는 소요일

        // 각 기능이 완료되는 일수를 계산하여 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        int count = 1; // 배포에 포함될 기능의 수
        int p = queue.poll(); // 첫 기능의 완료 일

        while (!queue.isEmpty()) {
            if (p >= queue.peek()) { // 현재 기능보다 빠르거나 동시에 완료되는 기능이 있을 경우
                count++;
                queue.poll();
            } else { // 현재 기능보다 늦게 완료되는 기능이 있을 경우
                list.add(count);
                count = 1;
                p = queue.poll();
            }
        }

        list.add(count);

        int[] answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
