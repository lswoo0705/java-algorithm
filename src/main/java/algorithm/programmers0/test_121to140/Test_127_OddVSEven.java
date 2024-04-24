package algorithm.programmers0.test_121to140;

public class Test_127_OddVSEven {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                odd += num_list[i];
            } else {
                even += num_list[i];
            }
        }

        return Math.max(odd, even);
    }
}
