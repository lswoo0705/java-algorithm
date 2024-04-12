package algorithm.programmers0.test_101to120;

import java.util.*;

public class Test_111_DeleteElementInArray {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> deleteSet = new HashSet<>();

        for (int num : delete_list) {
            deleteSet.add(num);
        }

        // answer[]의 길이
        int count = 0;
        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                count++;
            }
        }

        int[] answer = new int[count];
        int index = 0;

        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}
