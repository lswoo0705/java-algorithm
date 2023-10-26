package algorithm.programmers0.test_71to80;

public class Test_77_TheSumOfConsecutiveNumbers {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int centerNum; // 중앙값
        int downNum; // 내려가야 하는 수

        if (total % num == 0) {
            centerNum = total / num;
            downNum = num / 2;
        } else {
            centerNum = total / num;
            downNum = num / 2 - 1;
        }

        for (int i = 0; i < num; i++) {
            answer[i] = centerNum - downNum + i;
        }

        return answer;
    }
}
