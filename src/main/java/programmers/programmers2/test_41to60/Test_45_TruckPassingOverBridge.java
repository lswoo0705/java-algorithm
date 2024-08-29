package programmers.programmers2.test_41to60;

import java.util.LinkedList;
import java.util.Queue;

public class Test_45_TruckPassingOverBridge {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // 현재 다리를 건너고 있는 트럭의 무게 합
        int currentWeight = 0;
        // 다리를 건너는 트럭들을 관리할 큐
        Queue<Integer> bridgeQueue = new LinkedList<>();

        // 다리를 건너기 시작할 트럭들의 초기화 (다리 길이 만큼 0으로 채워놓음)
        for (int i = 0; i < bridge_length; i++) {
            bridgeQueue.offer(0);
        }

        int time = 0; // 경과 시간
        int index = 0; // 다음으로 다리를 건너야 할 트럭의 인덱스

        while (index < truck_weights.length || currentWeight > 0) {
            time++; // 매 초마다 시간 증가

            // 다리의 가장 앞부분에 있는 트럭(혹은 빈 공간)을 다리에서 제거
            int truck = bridgeQueue.poll();
            currentWeight -= truck; // 다리를 떠나는 트럭의 무게를 현재 다리 무게에서 뺌

            if (index < truck_weights.length) {
                // 다음 트럭이 다리에 올라갈 수 있는지 확인
                if (currentWeight + truck_weights[index] <= weight) {
                    // 트럭이 다리에 올라갈 수 있다면 다리에 트럭 추가
                    bridgeQueue.offer(truck_weights[index]);
                    currentWeight += truck_weights[index]; // 현재 다리 무게에 추가
                    index++; // 다음 트럭으로 이동
                } else {
                    // 트럭이 다리에 올라갈 수 없다면 빈 공간 추가
                    bridgeQueue.offer(0);
                }
            } else {
                // 모든 트럭이 다리에 올라갔지만 다리 위에 트럭이 남아있을 경우 빈 공간 추가
                bridgeQueue.offer(0);
            }
        }

        return time; // 모든 트럭이 다리를 건너는 데 걸린 시간 반환
    }
}
