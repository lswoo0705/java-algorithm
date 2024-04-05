package algorithm.programmers0.test_81to100;

public class Test_98_CreateArray {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = k * (i + 1);
        }
        return answer;
    }
}
