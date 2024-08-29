package programmers.programmers1.test_01to20;

public class Test_15_AddNegAndPosNum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int[] num = new int[absolutes.length];

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                num[i] = absolutes[i];
            } else {
                num[i] = -absolutes[i];
            }
        }

        for (int j : num) {
            answer += j;
        }
        return answer;
    }
}
