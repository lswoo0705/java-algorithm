package algorithm.programmers1.test_41to60;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_53_MockTest {
    public int[] solution(int[] answers) {
//        int[] first = {1, 2, 3, 4, 5};
//        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
//        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//        int[] answerCount = new int[3];
//
//        for (int i = 0; i < answers.length; i++) {
//            // 1번 수포자
//            if (answers[i] == first[i % 5]) {
//                answerCount[0]++;
//            }
//            // 2번 수포자
//            if (answers[i] == second[i % 8]) {
//                answerCount[1]++;
//            }
//            // 3번 수포자
//            if (answers[i] == third[i % 10]) {
//                answerCount[2]++;
//            }
//        }
//        // 수포자들 중 최대 점수 찾기
//        int maxNum = answerCount[0];
////        int maxIndex = 0;
//        for (int i : answerCount) {
//            if (i > maxNum) {
//                maxNum = i;
////                maxIndex = i;
//            }
//        }
//        // 최대점수 인원수 구하기
//        int maxCount = 0;
//        for (int i = 0; i < answerCount.length; i++) {
//            if (answerCount[i] == maxNum) {
//                maxCount++;
//            }
//        }
//        int[] answer = new int[maxCount];
//        for (int i = 0; i < answerCount.length; i++) {
//            for (int j = 0; j < answer.length; j++) {
//                if (maxNum == answerCount[i]) {
//                    answer[j] = i + 1;
//                }
//            }
//        }
//
//        return answer;

        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] answerCount = new int[3];

        for (int i = 0; i < answers.length; i++) {
            // 1번 수포자
            if (answers[i] == first[i % 5]) {
                answerCount[0]++;
            }
            // 2번 수포자
            if (answers[i] == second[i % 8]) {
                answerCount[1]++;
            }
            // 3번 수포자
            if (answers[i] == third[i % 10]) {
                answerCount[2]++;
            }
        }

        // 수포자들 중 최대 점수 찾기
        int maxNum = Arrays.stream(answerCount).max().orElse(0);

        // 최대점수 인원수 구하기
        int maxCount = (int) Arrays.stream(answerCount).filter(count -> count == maxNum).count();

        // 최대 점수인 수포자의 번호를 어레이리스트로 구하기
        ArrayList<Integer> maxIndexList = new ArrayList<>();
        for (int i = 0; i < answerCount.length; i++) {
            if (answerCount[i] == maxNum) {
                maxIndexList.add(i + 1);
            }
        }

        // 어레이리스트를 배열로 변환
        int[] answer = new int[maxIndexList.size()];
        for (int i = 0; i < maxIndexList.size(); i++) {
            answer[i] = maxIndexList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_53_MockTest sol = new Test_53_MockTest();
//        int[] answers = {1, 2, 3, 4, 5};
        int[] answers = {1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(sol.solution(answers)));

    }
}
