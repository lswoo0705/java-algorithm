package algorithm.programmers0.Test_51to60;

import java.util.Arrays;

public class Test_52_AppearedOnlyOnceNum {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split("");
        Arrays.sort(sArr);
        int cnt = 0;
        for (int i = 0; i < sArr.length; i++) {
            cnt = 0;
            for (int j = 0; j < sArr.length; j++) {
                if (sArr[i].equals(sArr[j])) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                answer += sArr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_52_AppearedOnlyOnceNum sol = new Test_52_AppearedOnlyOnceNum();
        String s = "abcabcadc";
        System.out.println(sol.solution(s));
    }
}
