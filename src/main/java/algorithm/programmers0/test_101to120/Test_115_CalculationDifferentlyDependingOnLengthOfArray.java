package algorithm.programmers0.test_101to120;

import java.util.Arrays;

public class Test_115_CalculationDifferentlyDependingOnLengthOfArray {
    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        if (arr.length % 2 == 1) {
            for (int i = 0; i < arr.length; i += 2) {
                answer[i] = arr[i] + n;
            }
        } else {
            for (int i = 1; i < arr.length; i += 2) {
                answer[i] = arr[i] + n;
            }
        }

        return answer;
    }
}
