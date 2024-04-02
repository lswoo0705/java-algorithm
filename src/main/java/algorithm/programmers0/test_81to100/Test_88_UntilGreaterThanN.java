package algorithm.programmers0.test_81to100;

public class Test_88_UntilGreaterThanN {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) {
                return answer;
            }
        }
        return answer;
    }
}
