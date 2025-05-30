package programmers.programmers0.test_221to240;

import java.util.HashSet;
import java.util.Set;

public class Test_222_Babbling { // 옹알이(1)
    public int solution(String[] babbling) {
//        int answer = 0;
//        // aya, ye, woo, ma 문자열들을 고정으로
//        String[] words = {"aya", "ye", "woo", "ma"};
//
//        // babbling 배열을 돌아가며 스트링빌더로 빼냄
//        for (String s : babbling) {
//            StringBuilder sb = new StringBuilder(s);
//            boolean[] used = new boolean[words.length];
//            boolean isValid = true;
//
//            // 옹알이 문자열이 있을 경우 그만큼 잘라내고
//            while (sb.length() > 0) {
//                boolean matched = false;
//
//                for (int j = 0; j < words.length; j++) {
//                    String word = words[j];
//                    if (!used[j] && sb.indexOf(word) == 0) {
//                        sb.delete(0, word.length());
//                        used[j] = true;
//                        matched = true;
//                        break;
//                    }
//                }
//
//                if (!matched) {
//                    isValid = false;
//                    break;
//                }
//            }
//
//            // 남는 문자가 없을 경우 answer++
//            if (isValid && sb.length() == 0) {
//                answer++;
//            }
//        }
//
//        return answer;

        // ---- 성공 ----

        // Set을 사용해서 words의 중복을 확인

        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String s : babbling) {
            String temp = s;
            Set<String> used = new HashSet<>();
            boolean isValid = true;

            while (!temp.isEmpty()) {
                boolean matched = false;
                for (String word : words) {
                    if (temp.startsWith(word) && !used.contains(word)) {
                        used.add(word);
                        temp = temp.substring(word.length());
                        matched = true;
                        break;
                    }
                }
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                answer++;
            }
        }
        return answer;
    }
}
