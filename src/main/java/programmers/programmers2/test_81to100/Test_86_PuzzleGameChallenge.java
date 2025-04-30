package programmers.programmers2.test_81to100;

public class Test_86_PuzzleGameChallenge { // 퍼즐 게임 챌린지
    public int solution(int[] diffs, int[] times, long limit) {
        // 난이도보다 숙련도가 높다면 timeCur만큼의 시간을 소요한다.
        // 숙련도보다 난이도가 높다면 난이도 - 숙련도 만큼 틀린다.
        // 이 때 문제를 틀릴 때마다 timeCur + TimePrev만큼의 시간이 소요된다.
        // 위의 과정을 반복한 후 timeCur 만큼의 시간을 소요하고 퍼즐을 해결한다.
        // 게임의 전체 제한 시간 limit가 정해져있을 때 퍼즐을 해결하기 위한 최소 숙련도는?

        // 문제를 이진 탐색으로 접근
        // 최소 숙련도 1에서부터 문제의 난이도들 중 최대값 사이를 이진 탐색하여 반복한다.

        int answer = 0;
        int left = 1;
        int right = diffs[0];
        for (int diff : diffs) {
            if (diff > right) {
                right = diff;
            }
        }

        while (left <= right) {
            int middle = (left + right) / 2;
            int totalTimes = getTotalTime(diffs, times, middle);

            if (totalTimes <= limit) {
                answer = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return answer;
    }

    private int getTotalTime(int[] diffs, int[] times, int middle) {
        int totalTime = 0;

        for (int i = 0; i < diffs.length; i++) {
            if (diffs[i] <= middle) {
                totalTime += times[i];
            } else {
                int failedCount = diffs[i] - middle;
                int timePrev = 0;
                if (i == 0) {
                    timePrev = 0;
                } else {
                    timePrev = times[i - 1];
                }
                totalTime += failedCount * (times[i] + timePrev) + times[i];
            }
        }

        return totalTime;
    }
}
