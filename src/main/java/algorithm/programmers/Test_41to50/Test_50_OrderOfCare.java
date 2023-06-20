package algorithm.programmers.Test_41to50;

import java.util.Arrays;
import java.util.Collections;

public class Test_50_OrderOfCare {
    public int[] solution(int[] emergency) {
        Integer[] sortedEmergency = Arrays.stream(emergency)
                .boxed()
                .sorted(Collections.reverseOrder())
                .toArray(Integer[]::new);
        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            int numOfArr = emergency[i];
            answer[i] = Arrays.asList(sortedEmergency).indexOf(numOfArr) + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_50_OrderOfCare sol = new Test_50_OrderOfCare();
        int[] emergency = {3, 76, 24};
        System.out.println(Arrays.toString(sol.solution(emergency)));
    }
}
