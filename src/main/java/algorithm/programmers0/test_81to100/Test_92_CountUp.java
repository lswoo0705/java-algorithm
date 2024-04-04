package algorithm.programmers0.test_81to100;

public class Test_92_CountUp {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num + i;
        }
        return answer;
    }
}
