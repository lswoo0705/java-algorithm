package programmers.programmers2.test_41to60;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test_48_Compression {
    public int[] solution(String msg) {
        // 사전 초기화
        Map<String, Integer> dictionary = new HashMap<>();
        int index = 1;
        for (char c = 'A'; c <= 'Z'; c++) {
            dictionary.put(String.valueOf(c), index++);
        }

        // 결과 저장 리스트
        List<Integer> result = new ArrayList<>();
        // 다음 추가될 사전 색인 번호
        int dictSize = 27;

        // 입력 문자열
        int i = 0;
        while (i < msg.length()) {
            // 현재 문자열
            String w = "";
            // 사전에 있는 가장 긴 문자열 w 찾기
            while (i < msg.length() && dictionary.containsKey(w + msg.charAt(i))) {
                w += msg.charAt(i);
                i++;
            }

            // 색인 번호 출력
            result.add(dictionary.get(w));

            // 새로운 문자열 w+c 추가
            if (i < msg.length()) {
                dictionary.put(w + msg.charAt(i), dictSize++);
            }
        }

        // 결과 반환
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
