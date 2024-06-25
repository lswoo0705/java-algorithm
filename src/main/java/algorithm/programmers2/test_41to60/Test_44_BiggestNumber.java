package algorithm.programmers2.test_41to60;

import java.util.Arrays;
import java.util.Comparator;

public class Test_44_BiggestNumber {
    public String solution(int[] numbers) {
        // 정수 배열을 문자열 배열로 변환합니다.
        String[] strNumbers = new String[numbers.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // (o1 + o2), (o2 + o1)를 비교하여 더 큰 순서로 정렬
        Arrays.sort(strNumbers, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // 정렬된 문자열 배열을 붙이기
        for (String str : strNumbers) {
            sb.append(str);
        }

        // 앞에 0이 있으면 0으로 반환
        String answer = sb.toString();
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer;
    }
}
