package programmers.programmers0.test_201to220;

import java.util.ArrayList;
import java.util.List;

public class Test_210_CreateArr2 {
    public int[] solution(int l, int r) {
        List<Integer> answerList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isValid(i)) {
                answerList.add(i);
            }
        }

        // 결과가 없을 경우
        if (answerList.isEmpty()) {
            return new int[]{-1};
        }

        // 리스트를 배열로 변환
        return answerList.stream().mapToInt(i -> i).toArray();
    }

    // 0과 5로만 이루어져있는지 확인
    private boolean isValid(int num) {
        String numStr = Integer.toString(num);
        for (char c : numStr.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }
}
