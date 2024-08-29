package programmers.programmers1.test_21to40;

import java.util.Arrays;

public class Test_24_PlaceStringInDescendingOrder {
    public String solution(String s) {
//        String answer = "";
//        StringBuilder stringBuilder = new StringBuilder();
//        String[] strS = s.split("");
//        Arrays.sort(strS, Comparator.reverseOrder());
//        for (int i = 0; i < strS.length; i++) {
//            stringBuilder.append(strS[i]);
//        }
//        answer = stringBuilder.toString();
//        return answer;

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new StringBuilder(new String(charArray)).reverse().toString();
    }
}
