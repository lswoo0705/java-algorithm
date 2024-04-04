package algorithm.programmers0.test_81to100;

public class Test_91_CalculationsBasedOnLength {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length > 10) {
            for (int j : num_list) {
                answer += j;
            }
        } else {
            answer = 1;
            for (int j : num_list) {
                answer *= j;
            }
        }
        return answer;
    }
}
