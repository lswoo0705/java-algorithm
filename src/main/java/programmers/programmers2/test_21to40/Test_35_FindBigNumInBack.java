package programmers.programmers2.test_21to40;

import java.util.Stack;

public class Test_35_FindBigNumInBack {
    public int[] solution(int[] numbers) {
//        int[] answer = new int[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (num < numbers[j]) {
//                    num = numbers[j];
//                    break;
//                }
//            }
//
//            if (num == numbers[i]) {
//                answer[i] = -1;
//            } else {
//                answer[i] = num;
//            }
//        }
//
//        return answer;

        // 시간 초과 -> Stack 사용

        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        // 뒷 큰수를 찾기위해 역방향 탐색
        for (int i = numbers.length - 1; i >= 0; i--) {
            // 스택의 최상단이 작거나 같으면 pop
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }

            // 스택 최상단이 뒷 큰수, 비어 있으면 뒷 큰수가 없음
            if (stack.isEmpty()) {
                answer[i] = -1;
            } else {
                answer[i] = stack.peek();
            }

            // 현재 숫자를 스택에 push
            stack.push(numbers[i]);
        }

        return answer;
    }
}
