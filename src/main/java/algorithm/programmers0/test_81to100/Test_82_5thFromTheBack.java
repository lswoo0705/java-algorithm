package algorithm.programmers0.test_81to100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_82_5thFromTheBack {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        List<Integer> sortedList = arrayToList(num_list);
        sortedList.remove(0);
        sortedList.remove(0);
        sortedList.remove(0);
        sortedList.remove(0);
        sortedList.remove(0);
        for (int i = 0; i < sortedList.size(); i++) {
            answer[i] = sortedList.get(i);
        }
        return answer;
    }

    public static List<Integer> arrayToList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        return list;
    }
}
