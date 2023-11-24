package algorithm.programmers1.test_41to60;

import java.util.ArrayList;
import java.util.Arrays;

public class Test_49_BundleOfCards {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
//        String answer;
//        boolean cards1Result = true;
//        boolean cards2Result = true;
//        // 각 카드뭉치 인덱스 숫자를 배열로 만들고 오름차순인지 확인
//        int[] cards1Sequence = new int[cards1.length];
//        int[] cards2Sequence = new int[cards2.length];
//        // 카드1에서 골의 인덱스 + 1 을 그대로 가져옴
//        for (int i = 0; i < cards1.length; i++) {
//            cards1Sequence[i] = Arrays.asList(goal).indexOf(cards1[i]) + 1;
//        }
//        // 카드2에서 골에있는 숫자를 그대로 가져옴
//        for (int i = 0; i < cards2.length; i++) {
//            cards2Sequence[i] = Arrays.asList(goal).indexOf(cards2[i]) + 1;
//        }
//        // goal에 없는 값이 cards1 또는 cards2에 있을 경우
//
//
//        // 오름차순인지 확인
//        for (int i = 0; i < cards1Sequence.length - 1; i++) {
//            if (cards1Sequence[i] > cards1Sequence[i + 1]) {
//                cards1Result = false;
//                break;
//            }
//        }
//        for (int i = 0; i < cards2Sequence.length - 1; i++) {
//            if (cards2Sequence[i] > cards2Sequence[i + 1]) {
//                cards2Result = false;
//                break;
//            }
//        }
//        // 둘 다 오름차순이면 Yes
//        answer = cards1Result && cards2Result ? "Yes" : "No";
//
//        return answer;

//        String answer;
//        boolean cards1Result = true;
//        boolean cards2Result = true;
//        // 각 카드뭉치 인덱스 숫자를 배열로 만들고 오름차순인지 확인
//        List<Integer> cards1SequenceList = new ArrayList<>();
//        List<Integer> cards2SequenceList = new ArrayList<>();
//        // 카드1에서 골의 인덱스 + 1 을 그대로 가져옴
//        for (int i = 0; i < cards1.length; i++) {
//            cards1SequenceList.add(Arrays.asList(goal).indexOf(cards1[i]) + 1);
//        }
//        // 카드2에서 골에있는 숫자를 그대로 가져옴
//        for (int i = 0; i < cards2.length; i++) {
//            cards2SequenceList.add(Arrays.asList(goal).indexOf(cards2[i]) + 1);
//        }
//        // goal에 없는 값이 cards1 또는 cards2에 있을 경우 제거
//        cards2SequenceList.removeAll(List.of(0));
//
//        // 오름차순인지 확인
//        for (int i = 0; i < cards1SequenceList.size() - 1; i++) {
//            if (cards1SequenceList.get(i) > cards1SequenceList.get(i + 1)) {
//                cards1Result = false;
//                break;
//            }
//        }
//        for (int i = 0; i < cards2SequenceList.size() - 1; i++) {
//            if (cards2SequenceList.get(i) > cards2SequenceList.get(i + 1)) {
//                cards2Result = false;
//                break;
//            }
//        }
//
//        // 둘 다 오름차순이면 Yes
//        answer = cards1Result && cards2Result ? "Yes" : "No";
//
//        return answer;

        String answer = "Yes";
        ArrayList cards1List = new ArrayList(Arrays.asList(cards1));
        ArrayList cards2List = new ArrayList(Arrays.asList(cards2));

        for (String s : goal) {
            if (cards1List.size() > 0 && s.equals(cards1List.get(0))) {
                cards1List.remove(0);
            } else if (cards2List.size() > 0 && s.equals(cards2List.get(0))) {
                cards2List.remove(0);
            } else {
                answer = "No";
            }
        }
        return answer;
    }
}
