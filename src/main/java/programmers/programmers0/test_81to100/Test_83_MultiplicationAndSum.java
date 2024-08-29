package programmers.programmers0.test_81to100;

public class Test_83_MultiplicationAndSum {
    public int solution(int[] num_list) {
        int multilication = 1;
        int sum = 0;
        for (int i = 0; i < num_list.length; i++) {
            multilication *= num_list[i];
            sum += num_list[i];
        }
        if (multilication < sum * sum) {
            return 1;
        } else {
            return 0;
        }
    }
}
