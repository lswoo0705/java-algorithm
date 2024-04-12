package algorithm.programmers2.test_01to20;

import java.util.Arrays;

public class Test_11_EnglishWordChain {
    public int[] solution(int n, String[] words) {
//        int[] answer = new int[2];
//        boolean overlap = false;
//        boolean fail = false;
//        int overlapIndex = 0;
//        int failIndex = 0;
//
//        // 중복탈락 구하기
//        Loop1 :
//        for (int i = 0; i < words.length - 1; i++) {
//            for (int j = i + 1; j < words.length; j++) {
//                if (words[i].equals(words[j])) {
//                    overlapIndex = j;
//                    overlap = true;
//                    break Loop1;
//                }
//            }
//        }
//
//        // 끝말잇기 실패 구하기
//        for (int i = 0; i < words.length - 1; i++) {
//            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
//                failIndex = i + 1;
//                fail = true;
//                break;
//            }
//        }
//
//        if (fail && !overlap || fail && failIndex <= overlapIndex) { // 끝말잇기 실패
//            answer[0] = failIndex % n + 1;
//            answer[1] = failIndex / n + 1;
//        } else if (overlap){ // 중복으로 실패
//            answer[0] = overlapIndex % n + 1;
//            answer[1] = overlapIndex / n + 1;
//        }
//
//        return answer;

        int[] answer = new int[2];

        for(int i=1;i<words.length;i++){
            // ch1 - 현재 단어의 첫 글자, ch2 - 이전 단어의 마지막 글자
            char ch1 = words[i].charAt(0);
            char ch2 = words[i-1].charAt(words[i-1].length()-1);

            for(int j=0;j<i;j++){
                // 이전에 말했던 단어가 있거나 ch1과 ch2가 서로 같지 않을 때
                if (words[i].equals(words[j]) || ch1 != ch2) {
                    // person - 틀린 사람이 몇 번째 사람인지 나타내는 변수
                    int person = (i+1)%n;

                    if (person == 0) {
                        person = n;
                    }

                    // answer[1]에는 person이 몇 번째 순서에 틀렸는지 계산한 값을 담음
                    answer[0] = person;answer[1] = (i/n)+1;
                }
            }
            // 틀린 사람을 발견했다면 종료
            if(answer[0]!=0) break;
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
