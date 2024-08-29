package programmers.programmers0.test_41to50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_41_Aliquot {
    public Integer[] solution(int n) {
        Integer[] answer = {};
        List<Integer> newList = new ArrayList<>(Arrays.asList(answer));
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                newList.add(i);
            }
        }
        return newList.toArray(new Integer[0]);
    }
}
