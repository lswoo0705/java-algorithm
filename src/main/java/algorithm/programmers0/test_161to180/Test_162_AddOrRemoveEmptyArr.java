package algorithm.programmers0.test_161to180;

import java.util.ArrayList;

public class Test_162_AddOrRemoveEmptyArr {
    public int[] solution(int[] arr, boolean[] flag) {
//        StringBuilder xString = new StringBuilder();
//
//        for (int i = 0; i < flag.length; i++) {
//            if (flag[i]) {
//                xString.append(String.valueOf(arr[i]).repeat(arr[i] * 2));
//            } else {
//                xString.delete(xString.length() - arr[i], xString.length());
//            }
//        }
//
//        int[] answer = new int[xString.length()];
//
//        for (int i = 0; i < xString.length(); i++) {
//            answer[i] = Character.getNumericValue(xString.charAt(i));
//        }
//
//        return answer;

        // List로 풀이
        ArrayList<Integer> xList = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    xList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    xList.remove(xList.size() - 1);
                }
            }
        }

        int[] answer = new int[xList.size()];

        for (int i = 0; i < xList.size(); i++) {
            answer[i] = xList.get(i);
        }

        return answer;
    }
}
