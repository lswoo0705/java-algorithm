package programmers.programmers1.test_81to100;

public class Test_85_FlexibleWorkSystem {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        // 직원은 출근 희망 시각 + 10분까지 어플로 출근
        // 토,일요일은 이벤트에 영향 없음
        // 직원이 설정한 희망 시각과 실제 기록으로 상품을 받을 직원의 수 파악

        // 1. schedules 배열의 모든 값들을 10분씩 더한다.
        for (int i = 0; i < schedules.length; i++) {
            schedules[i] = addMinutes(schedules[i] + 10);
        }

        // 2. 일주일 중에서 startday를 참고하여 토,일요일의 값은 제외한다. -> 제외를 출근희망 시각과 동일하게 변경
        for (int i = 0; i < timelogs.length; i++) {
            // 월요일(1) 시작 -> 주말은 6, 7 -> 인덱스는 5, 6
            // 수요일(3) 시작 -> 주말은 4, 5 -> 인덱스는 3, 4
            timelogs[i][(6 - startday + 7) % 7] = schedules[i];
            timelogs[i][(7 - startday + 7) % 7] = schedules[i];
        }

        // 3. 각 인원별로 출근 인정 시각 안에 출근했는지 확인
        for (int i = 0; i < schedules.length; i++) {
            boolean lateness = false;
            for (int j = 0; j < timelogs[i].length; j++) {
                if (schedules[i] < timelogs[i][j]) {
                    lateness = true;
                    break;
                }
            }
            if (!lateness) {
                answer++;
            }
        }

        return answer;
    }

    private int addMinutes(int time) {
        int hour = time / 100;
        int minute = time % 100;
        if (minute >= 60) {
            hour++;
            minute -= 60;
        }

        return hour * 100 + minute;
    }
}
