package algorithm.programmers;

import java.util.Arrays;

public class Test_19_CenterValue {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[array.length / 2];
        return answer;
    }
}