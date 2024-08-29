package programmers.programmers1.test_41to60;

import java.util.Arrays;

public class Test_43_SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] strArr1 = new String[n];
        String[] strArr2 = new String[n];
        // 정답을 채울 빈 문자열 지도
        Arrays.fill(answer, String.format("%" + n + "s", ""));
        // 지도의 숫자를 2진수로 바꾸고 n자리수만큼 왼쪽에 0으로 채우기
        for (int i = 0; i < n; i++) {
            strArr1[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i])).replace(' ', '0');
            strArr2[i] = String.format("%" + n + "s", Integer.toBinaryString(arr2[i])).replace(' ', '0');
            answer[i] = String.format("%" + n + "s", "");
        }
        // 지도 1,2에 '1'이 하나라도 있다면 answer의 같은 위치 공백을 '#'으로 바꾸기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (strArr1[i].charAt(j) == '1' || strArr2[i].charAt(j) == '1') {
                    answer[i] = answer[i].substring(0, j) + '#' + answer[i].substring(j + 1);
                }
            }
        }
        return answer;
    }
}
