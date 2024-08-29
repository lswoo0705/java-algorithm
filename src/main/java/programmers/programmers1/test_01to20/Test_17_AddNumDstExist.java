package programmers.programmers1.test_01to20;

public class Test_17_AddNumDstExist {
    public int solution(int[] numbers) {
        int answer = 0;

        // 0~9 합 = 45
        for (int i = 0; i < 10; i++) {
            answer += i;
        }

        for (int number : numbers) {
            answer -= number;
        }
        return answer;
    }
}
