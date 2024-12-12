package programmers.programmers0.test_181to200;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test_194_PickingKNumbersAtRandom {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : arr) {
            set.add(i);
            if (set.size() == k) {
                break;
            }
        }

        int num = 0;

        for (int i : set) {
            answer[num++] = i;
        }

        return answer;
    }
}
