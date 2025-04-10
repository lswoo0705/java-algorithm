package programmers.programmers2.test_81to100;

import java.util.ArrayList;
import java.util.List;

public class Test_81_MineCraft {
    public int solution(int[] picks, String[] minerals) {
        // 무조건 광물은 5개마다 하나의 곡괭이를 사용한다.
        // minerals를 미리 5개 씩 나눌 수 있다.
        // 각 묶음별로 피로도를 구해서 피로도가 높은거는 좋은 곡괭이로?

        int answer = 0;

        // 1. 광물을 5개씩 묶어서 그룹 생성
        List<List<String>> mineralGroups = new ArrayList<>();
        for (int i = 0; i < minerals.length; i += 5) {
            List<String> group = new ArrayList<>();
            for (int j = i; j < i + 5 && j < minerals.length; j++) {
                group.add(minerals[j]);
            }
            mineralGroups.add(group);
        }

        // 2. 사용할 수 있는 곡괭이 수 만큼만 그룹 고려
        int totalPicks = picks[0] + picks[1] + picks[2];
        int maxGroups = Math.min(totalPicks, mineralGroups.size());

        // 3. 그룹당 피로도 계산
        List<int[]> fatigueGroups = new ArrayList<>();
        for (int i = 0; i < maxGroups; i++) {
            List<String> group = mineralGroups.get(i);
            int dia = 0, iron = 0, stone = 0;
            for (String m : group) {
                switch (m) {
                    case "diamond" -> {
                        dia += 1;
                        iron += 5;
                        stone += 25;
                    }
                    case "iron" -> {
                        dia += 1;
                        iron += 1;
                        stone += 5;
                    }
                    case "stone" -> {
                        dia += 1;
                        iron += 1;
                        stone += 1;
                    }
                }
            }
            fatigueGroups.add(new int[]{dia, iron, stone});
        }

        // 4. stone 기준으로 피로도가 높은 순서대로 정렬
        fatigueGroups.sort((a, b) -> b[2] - a[2]);

        // 5. 곡괭이를 사용해서 피로도 누적
        int index = 0;

        for (int i = 0; i < picks[0]; i++) { // 다이아 곡괭이
            if (index >= fatigueGroups.size()) break;
            answer += fatigueGroups.get(index++)[0];
        }
        for (int i = 0; i < picks[1]; i++) { // 철 곡괭이
            if (index >= fatigueGroups.size()) break;
            answer += fatigueGroups.get(index++)[1];
        }
        for (int i = 0; i < picks[2]; i++) { // 돌 곡괭이
            if (index >= fatigueGroups.size()) break;
            answer += fatigueGroups.get(index++)[2];
        }

        return answer;

    }
}
