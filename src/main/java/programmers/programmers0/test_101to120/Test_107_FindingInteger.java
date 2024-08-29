package programmers.programmers0.test_101to120;

import java.util.Arrays;

public class Test_107_FindingInteger {
    public int solution(int[] num_list, int n) {
        boolean isExist = Arrays.stream(num_list).anyMatch(x -> x == n);

        return isExist ? 1 : 0;
    }
}
