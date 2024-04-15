package algorithm.programmers2.test_01to20;

import java.util.*;

//public class Test_17_selectTangerin {
//    public int solution(int k, int[] tangerine) {
//        Arrays.sort(tangerine);
//        List<Integer> tangerineList = new ArrayList<>();
//        for (int t : tangerine) {
//            tangerineList.add(t);
//        }
//        int tangerineBox = 0;
//        int answerCount = 0;
//
//        while (!tangerineList.isEmpty() && tangerineBox < k) {
//            // 최빈값 구하기
//            int fruitSize = mostFrequentFruit(tangerineList);
//
//            // 최빈값의 개수 구하기
//            int fruitCount = Collections.frequency(tangerineList, fruitSize);
//
//            // 상자에 과일을 담을 수 있는지 확인
//            if (tangerineBox + fruitCount <= k) {
//                tangerineBox += fruitCount;
//
//                // 리스트에서 최빈값 제거
//                tangerineList.removeAll(Collections.singletonList(fruitSize));
//            } else {
//                answerCount++;
//                break;
//            }
//
//            answerCount++;
//        }
//
//        return answerCount;
//    }
//
//    private int mostFrequentFruit(List<Integer> tangerineList) {
//        Map<Integer, Integer> frequencyMap = new HashMap<>();
//
//        for (int t : tangerineList) {
//            frequencyMap.put(t, frequencyMap.getOrDefault(t, 0) + 1);
//        }
//
//        int maxFrequency = 0;
//        int mode = 0;
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            if (entry.getValue() > maxFrequency) {
//                maxFrequency = entry.getValue();
//                mode = entry.getKey();
//            }
//        }
//
//        return mode;
//    }
//}
//

// 정확성 82.4% 시간초과


public class Test_17_selectTangerin {
    public int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int t : tangerine) {
            frequencyMap.put(t, frequencyMap.getOrDefault(t, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(frequencyMap.entrySet());
        sortedList.sort((a, b) -> {
            int cmp = Integer.compare(b.getValue(), a.getValue());
            if (cmp == 0) {
                return Integer.compare(a.getKey(), b.getKey());
            }
            return cmp;
        });

        int tangerineBox = 0;
        int answerCount = 0;
        for (Map.Entry<Integer, Integer> entry : sortedList) {
            int fruitCount = entry.getValue();

            int count = Math.min(k - tangerineBox, fruitCount);
            if (count <= 0) {
                break;
            }

            tangerineBox += count;
            answerCount++;

            if (tangerineBox >= k) {
                break;
            }
        }

        return answerCount;
    }
}