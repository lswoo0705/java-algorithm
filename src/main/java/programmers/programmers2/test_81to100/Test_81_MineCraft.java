package programmers.programmers2.test_81to100;

import java.util.ArrayList;
import java.util.List;

public class Test_81_MineCraft {
    public int solution(int[] picks, String[] minerals) {
        // 무조건 광물은 5개마다 하나의 곡괭이를 사용한다.
        // minerals를 미리 5개 씩 나눌 수 있다.
        // 각 묶음별로 피로도를 구해서 피로도가 높은거는 좋은 곡괭이로?

        int answer = 0;

        // 1.리스트를 만들어서 광물 5개 씩 넣기
        List<List<String>> mineralGroups = new ArrayList<>();
        for (int i = 0; i < minerals.length; i += 5) {
            List<String> group = new ArrayList<>();
            for (int j = i; j < i + 5 && j < minerals.length; j++) {
                group.add(minerals[j]);
            }
            mineralGroups.add(group);
        }

        // 2.묶음별로 피로도를 계산
        List<int[]> fatigueGroups = new ArrayList<>();
        for (List<String> group : mineralGroups) {
            // 각 피로도
            int diamondFatigue = 0;
            int ironFatigue = 0;
            int stoneFatigue = 0;

            for (String n : group) {
                switch (n) {
                    case "diamond" -> {
                        diamondFatigue += 1;
                        ironFatigue += 5;
                        stoneFatigue += 25;
                    }
                    case "iron" -> {
                        diamondFatigue += 1;
                        ironFatigue += 1;
                        stoneFatigue += 5;
                    }
                    case "stone" -> {
                        diamondFatigue += 1;
                        ironFatigue += 1;
                        stoneFatigue += 1;
                    }
                }
            }
            fatigueGroups.add(new int[]{diamondFatigue, ironFatigue, stoneFatigue});
        }

        // 3.곡괭이를 피로도가 높은 순으로 할당해서 계산
        fatigueGroups.sort((a, b) -> b[2] - a[2]);

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
