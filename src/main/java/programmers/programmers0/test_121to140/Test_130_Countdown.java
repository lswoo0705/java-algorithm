package programmers.programmers0.test_121to140;

public class Test_130_Countdown {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int startNum = start;

        for (int i = 0; i < start - end_num + 1; i++) {
            answer[i] = startNum;
            startNum--;
        }

        return answer;
    }
}
