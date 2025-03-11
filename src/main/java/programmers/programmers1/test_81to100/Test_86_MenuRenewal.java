package programmers.programmers1.test_81to100;

import java.util.*;

public class Test_86_MenuRenewal {
    public String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>();

        for (int c : course) {
            Map<String, Integer> combinationCount = new HashMap<>();
            int maxCount = 2; // 최소 2명 이상이 주문해야 하므로 2로 설정

            // 각 주문에서 조합 생성
            for (String order : orders) {
                char[] orderArr = order.toCharArray();
                Arrays.sort(orderArr); // 알파벳 정렬
                getCombinations(orderArr, c, 0, "", combinationCount);
            }

            // 가장 많이 주문된 조합 찾기
            for (Map.Entry<String, Integer> entry : combinationCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                }
            }

            // 가장 많이 주문된 조합 추가
            for (Map.Entry<String, Integer> entry : combinationCount.entrySet()) {
                if (entry.getValue() == maxCount) {
                    answerList.add(entry.getKey());
                }
            }
        }

        Collections.sort(answerList); // 사전순 정렬
        return answerList.toArray(new String[0]);
    }

    private void getCombinations(char[] order, int length, int index, String current, Map<String, Integer> combinationCount) {
        if (current.length() == length) {
            combinationCount.put(current, combinationCount.getOrDefault(current, 0) + 1);
            return;
        }

        for (int i = index; i < order.length; i++) {
            getCombinations(order, length, i + 1, current + order[i], combinationCount);
        }
    }
}
