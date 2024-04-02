package algorithm.programmers2.test_01to20;

public class Test_02_JadenCaseString {
    public String solution(String s) {
//        StringBuilder answer = new StringBuilder();
//        String[] sArr = s.split(" ");
//
//        for (int i = 0; i < sArr.length; i++) {
//            if (sArr[i].charAt(0) >= 48 && sArr[i].charAt(0) <= 57) {
//                answer.append(sArr[i]);
//            } else {
//                answer.append(String.valueOf(sArr[i].charAt(0)).toUpperCase());
//                answer.append(sArr[i].substring(1).toLowerCase());
//            }
//            if (i < sArr.length - 1) {
//                answer.append(" ");
//            }
//        }
//
//        return answer.toString();

        // 시간 초과

        StringBuilder answer = new StringBuilder();
        boolean isFirstChar = true;

        for (char c : s.toCharArray()) {
            if (isFirstChar) {
                answer.append(Character.toUpperCase(c));
                isFirstChar = false;
            } else {
                answer.append(Character.toLowerCase(c));
            }

            if (c == ' ') {
                isFirstChar = true;
            }
        }

        return answer.toString();
    }
}
