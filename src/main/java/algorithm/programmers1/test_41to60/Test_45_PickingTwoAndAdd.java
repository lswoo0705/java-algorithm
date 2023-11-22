package algorithm.programmers1.test_41to60;

import java.util.*;

public class Test_45_PickingTwoAndAdd {
    public int[] solution(int[] numbers) {
//        List<Integer> answerList = new ArrayList<>();
//
//        for (int i = 0; i < numbers.length - 1; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                answerList.add(numbers[i] + numbers[j]);
//            }
//        }
//
//        answerList = answerList.stream().distinct().collect(Collectors.toList());
//
//        int[] answer = new int[answerList.size()];
//        for (int i = 0; i < answerList.size(); i++) {
//            answer[i] = answerList.get(i);
//        }
//        Arrays.sort(answer);
//
//        return answer;

        Set<Integer> answerSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[answerSet.size()];
        int index = 0;

        for (int num : answerSet) {
            answer[index++] = num;
        }

        Arrays.sort(answer);
        return answer;
    }
}
