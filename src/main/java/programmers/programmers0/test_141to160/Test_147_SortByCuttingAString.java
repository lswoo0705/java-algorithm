package programmers.programmers0.test_141to160;

import java.util.Arrays;

public class Test_147_SortByCuttingAString {
    public String[] solution(String myString) {
//        StringBuilder myNewString = new StringBuilder();
//        char prevChar = '\0';
//
//        for (int i = 0; i < myString.length(); i++) {
//            char currentChar = myString.charAt(i);
//
//            if (currentChar != prevChar || currentChar != 'x') {
//                myNewString.append(currentChar);
//            }
//
//            prevChar = currentChar;
//        }
//
//        for (int i = 0; i < myNewString.length(); i++) {
//            if (myNewString.charAt(0) == 'x') {
//                myNewString = new StringBuilder(myNewString.substring(1));
//            } else if (myNewString.charAt(myNewString.length() - 1) == 'x') {
//                myNewString = new StringBuilder(myNewString.substring(0, myNewString.length() - 1));
//            }
//        }
//
//        String[] answer = myNewString.toString().split("x");
//        Arrays.sort(answer);
//
//        return answer;

        return Arrays.stream(myString.split("x")).filter(s -> !s.isEmpty()).sorted().toArray(String[]::new);
    }
}
