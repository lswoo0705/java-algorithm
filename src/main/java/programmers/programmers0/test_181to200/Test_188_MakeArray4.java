package programmers.programmers0.test_181to200;

import java.util.ArrayList;
import java.util.List;

//public class Test_188_MakeArray4 {
//    public int[] solution(int[] arr) {
//        List<Integer> stk = new ArrayList<>();
//        int i = 0;
//
//        while (i < arr.length) {
//            if (stk.size() == 0) {
//                stk.add(arr[i]);
//                i++;
//            } else if (stk.size() != 0 && stk.get(stk.size() - 1) < arr[i]) {
//                stk.add(arr[i]);
//                i++;
//            } else if (stk.size() != 0 && stk.get(stk.size() - 1) >= arr[i]) {
//                stk.remove(stk.size() - 1);
//            }
//        }
//
//        int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();
//
//        return answer;
//    }
//}

public class Test_188_MakeArray4 {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.size() == 0) {
                stk.add(arr[i]);
                i++;
            } else if (stk.get(stk.size() - 1) < arr[i]) {
                stk.add(arr[i]);
                i++;
            }
            if (stk.get(stk.size() - 1) >= arr[i]) {
                stk.remove(stk.size() - 1);
            } else {
                stk.add(arr[i]);
                i++;
            }
        }

        int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
