package programmers.programmers2.test_21to40;

import java.util.Arrays;
import java.util.HashMap;

public class Test_25_Clothes {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] str = new String[clothes.length];

        // key에 의상종류, value에 수량
        // key가 중복된다면 value += 1
        for (int i = 0; i < clothes.length; i++) {
            str[i] = clothes[i][1];

            // 중복이 아닐 경우 1을 넣고
            if (map.get(clothes[i][1]) == null) {
                map.put(clothes[i][1], 1);
            }
            // 중복일 경우 value += 1
            else if (map.get(clothes[i][1]) != null) {
                int x = map.get(clothes[i][1]);
                map.put(clothes[i][1], x + 1);
            }
        }

        String[] str2 = Arrays.stream(str).distinct().toArray(String[]::new);

        int value = 1;
        for (String s : str2) {
            value *= (map.get(s) + 1);
        }

        return value - 1;
    }
}
