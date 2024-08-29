package programmers.programmers0.test_161to180;

import java.util.ArrayList;
import java.util.List;

public class Test_165_CreatingArr5 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
//        List<Integer> numList = new ArrayList<>();
//
//        for (String intStr : intStrs) {
//            int num = Integer.parseInt(intStr.substring(s, s + l));
//
//            if (num > k) {
//                numList.add(num);
//            }
//        }
//
//        int[] answer = new int[numList.size()];
//
//        for (int i = 0; i < numList.size(); i++) {
//            answer[i] = numList.get(i);
//        }
//
//        return answer;

        List<Integer> numList = new ArrayList<>();

        for (String intStr : intStrs) {
            int num = Integer.parseInt(intStr.substring(s, s + l));

            if (num > k) {
                numList.add(num);
            }
        }

        return numList.stream().mapToInt(i -> i).toArray();
    }
}
