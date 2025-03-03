package programmers.programmers2.test_61to80;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Test_64_CheckInHotel {
    public int solution(String[][] book_time) {
        // 예약 시간을 분 단위로
        int[][] times = new int[book_time.length][2];

        for (int i = 0; i < book_time.length; i++) {
            times[i][0] = toMinutes(book_time[i][0]); // 시작 시간
            times[i][1] = toMinutes(book_time[i][1]) + 10; // 종료 시간 + 청소 시간(10분)
        }

        // 시작 시간을 기준으로 정렬
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));

        // 우선순위 큐 (현재 사용 중인 객실의 종료 시간을 저장)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] time : times) {
            if (!pq.isEmpty() && pq.peek() <= time[0]) {
                pq.poll(); // 가장 빠른 종료 시간이 현재 시작 시간보다 작으면 제거 (객실 재사용 가능)
            }
            pq.offer(time[1]); // 새로운 종료 시간 추가
        }

        return pq.size(); // 필요한 최소 객실 개수
    }

    // HH:MM 형식을 분(min) 단위로 변환
    private int toMinutes(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }
}
