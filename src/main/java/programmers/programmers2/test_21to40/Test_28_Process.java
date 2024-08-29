package programmers.programmers2.test_21to40;

import java.util.*;

public class Test_28_Process {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) {
            queue.offer(priority);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean isMax = true;

            for (int priority : queue) {
                if (priority > current) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                answer++;
                if (location == 0) break;
            } else {
                queue.offer(current);
            }

            location = (location - 1 + queue.size()) % queue.size();
        }

        return answer;
    }
}
