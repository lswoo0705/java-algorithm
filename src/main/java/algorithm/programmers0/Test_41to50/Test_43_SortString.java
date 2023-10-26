package algorithm.programmers0.Test_41to50;

import java.util.Arrays;

public class Test_43_SortString {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_43_SortString sol = new Test_43_SortString();
        String my_string = "heLLo";
        System.out.println(sol.solution(my_string));
    }
}
