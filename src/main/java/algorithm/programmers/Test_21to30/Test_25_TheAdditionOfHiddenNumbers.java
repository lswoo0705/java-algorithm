package algorithm.programmers.Test_21to30;

import java.util.Arrays;

public class Test_25_TheAdditionOfHiddenNumbers {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.replaceAll("[a-zA-Z]", "").split("");
        for (int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        return answer;
    }
}
