package algorithm.programmers0.test_181to200;

import java.util.Stack;

public class Test_185_CreateArr6 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (!stack.isEmpty() && stack.peek() == num) {
                stack.pop(); // 연속된 숫자 제거
            } else {
                stack.push(num);
            }
        }

        if (stack.isEmpty()) {
            return new int[]{-1};
        }

        // 스택을 배열로 변환
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }
}
