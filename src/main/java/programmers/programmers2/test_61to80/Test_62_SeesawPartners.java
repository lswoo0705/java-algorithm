package programmers.programmers2.test_61to80;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test_62_SeesawPartners {
    public long solution(int[] weights) {
//        long answer = 0;
//        Map<Integer, Integer> weightCount = new HashMap<>();
//
//        // 몸무게 등장 횟수 세기
//        for (int weight : weights) {
//            weightCount.put(weight, weightCount.getOrDefault(weight, 0) + 1);
//        }
//
//        // 가능한 시소 짝꿍 비율
//        int[][] ratios = {{1, 1}, {2, 3}, {1, 2}, {3, 4}};
//
//        // 몸무게별 조합 확인
//        for (int weight : weightCount.keySet()) {
//            int count = weightCount.get(weight);
//
//            // 같은 몸무게끼리 짝꿍 (nC2 = n * (n-1) / 2)
//            if (count > 1) {
//                answer += (long) count * (count - 1) / 2;
//            }
//
//            // 다른 몸무게와 짝꿍 확인
//            for (int[] ratio : ratios) {
//                int pairWeight = weight * ratio[1] / ratio[0];
//                if (pairWeight != weight && weightCount.containsKey(pairWeight)) {
//                    answer += (long) count * weightCount.get(pairWeight);
//                }
//            }
//        }
//
//        return answer;

        // -------- 52.9% -------

        long answer = 0;
        Arrays.sort(weights); // 정렬하여 중복 탐색을 줄임
        Map<Integer, Integer> countMap = new HashMap<>();

        // 몸무게 등장 횟수 카운팅
        for (int weight : weights) {
            countMap.put(weight, countMap.getOrDefault(weight, 0) + 1);
        }

        // 같은 몸무게끼리 짝꿍 만들기 (nC2 = n * (n-1) / 2)
        for (int weight : countMap.keySet()) {
            int count = countMap.get(weight);
            if (count > 1) {
                answer += (long) count * (count - 1) / 2;
            }
        }

        // 시소 균형을 이루는 배율 (1:1 제외)
        int[][] ratios = {{2, 3}, {1, 2}, {3, 4}};

        // 다른 몸무게와 짝꿍 찾기
        for (int weight : countMap.keySet()) {
            int count = countMap.get(weight);

            for (int[] ratio : ratios) {
                int num = weight * ratio[1];
                int den = ratio[0];

                if (num % den != 0) continue;  // 정수 값이 아닐 경우 무시

                int pairWeight = num / den;
                if (pairWeight != weight && countMap.containsKey(pairWeight)) {
                    answer += (long) count * countMap.get(pairWeight);
                }
            }
        }

        return answer;
    }
}
