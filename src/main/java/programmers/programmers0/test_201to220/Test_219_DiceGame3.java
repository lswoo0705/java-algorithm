package programmers.programmers0.test_201to220;

import java.util.*;

public class Test_219_DiceGame3 {
    public int solution(int a, int b, int c, int d) {
        // 주사위 값들을 배열에 담아서 빈도를 계산
        int[] dice = {a, b, c, d};
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : dice) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // 빈도에 따라 점수 계산
        List<Integer> freqValues = new ArrayList<>(frequency.values());

        // 1. 네 주사위 숫자가 모두 같을 때
        if (freqValues.size() == 1) {
            return 1111 * dice[0];
        }

        // 2. 세 주사위 숫자가 같고, 나머지 하나가 다를 때
        if (freqValues.size() == 2 && freqValues.contains(3)) {
            int p = -1, q = -1;
            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 3) p = entry.getKey();
                if (entry.getValue() == 1) q = entry.getKey();
            }
            return (10 * p + q) * (10 * p + q);
        }

        // 3. 두 주사위 숫자가 두 개씩 같은 값일 때
        if (freqValues.size() == 2 && freqValues.contains(2)) {
            List<Integer> keys = new ArrayList<>(frequency.keySet());
            int p = keys.get(0), q = keys.get(1);
            return (p + q) * Math.abs(p - q);
        }

        // 4. 두 주사위에서 나온 숫자가 하나 같고 나머지 두 주사위가 각각 다를 때
        if (freqValues.size() == 3) {
            int q = -1, r = -1;
            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 1) {
                    if (q == -1) q = entry.getKey();
                    else r = entry.getKey();
                }
            }
            return q * r;
        }

        // 5. 네 주사위 숫자가 모두 다를 때
        return Collections.min(frequency.keySet());
    }
}
