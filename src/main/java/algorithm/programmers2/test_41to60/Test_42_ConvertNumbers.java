package algorithm.programmers2.test_41to60;

import java.util.LinkedList;
import java.util.Queue;

// 숫자 변환하기
public class Test_42_ConvertNumbers {
    public int solution(int x, int y, int n) {
        // 너비 우선 탐색(BFS) 활용
        if (x == y) {
            return 0;
        }

        // BFS를 위한 큐와 방문 배열을 초기화합니다.
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visit = new boolean[y + 1];

        // 처음 x값과 0을 큐에 추가하고, x를 방문
        queue.add(new int[]{x, 0});
        visit[x] = true;

        // BFS 탐색
        while (!queue.isEmpty()) {
            // 큐에서 연산 횟수를 꺼냄
            int[] current = queue.poll();
            int currentValue = current[0];
            int currentStep = current[1];

            int[] nextValue = new int[]{currentValue + n, currentValue * 2, currentValue * 3};

            for (int m : nextValue) {
                // 다음 값이 y와 같다면 1을 더해서 반환
                if (m == y) {
                    return currentStep + 1;
                }

                // 다음 값이 y보다 작고, 아직 방문하지 않았다면 큐에 추가하고 배열을 갱신
                if (m < y && !visit[m]) {
                    queue.add(new int[]{m, currentStep + 1});
                    visit[m] = true;
                }
            }
        }

        // y값을 못찾았다면 -1 반환
        return -1;
    }
}
