package algorithm.programmers2.test_01to20;

import java.util.Arrays;

public class Test_11_EnglishWordChain {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        boolean overlap = false;
        boolean fail = false;
        int overlapIndex = 0;
        int failIndex = 0;

        // 중복탈락 구하기
        Loop1 :
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    overlapIndex = j;
                    overlap = true;
                    break Loop1;
                }
            }
        }

        // 끝말잇기 실패 구하기
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                failIndex = i + 1;
                fail = true;
                break;
            }
        }

        if (fail && !overlap || fail && failIndex <= overlapIndex) { // 끝말잇기 실패
            answer[0] = failIndex % n + 1;
            answer[1] = failIndex / n + 1;
        } else if (overlap){ // 중복으로 실패
            answer[0] = overlapIndex % n + 1;
            answer[1] = overlapIndex / n + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_11_EnglishWordChain sol = new Test_11_EnglishWordChain();
//        int n = 3; String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//        int n = 5; String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
//        int n = 2; String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
//        int n = 3; String[] words = {"tank", "kick", "know", "wheel", "iand", "dream", "mother", "robot", "tank"};
        int n = 2; String[] words = {"land", "dream", "mom", "mom"};
        System.out.println(Arrays.toString(sol.solution(n, words)));
    }
}
