package programmers.programmers2.test_21to40;

import java.util.Stack;

public class Test_32_TargetNumber {
    public int solution(int[] numbers, int target) {

        // 1. 재귀함수 풀이
//        return dfs(numbers, target, 0, 0);
//    }
//
//    private int dfs(int[] numbers, int target, int index, int sum) {
//        if (index == numbers.length) {
//            if (sum == target) {
//                return 1;
//            } else {
//                return 0;
//            }
//        }
//
//        int count = 0;
//        count += dfs(numbers, target, index + 1, sum + numbers[index]);
//        count += dfs(numbers, target, index + 1, sum - numbers[index]);
//
//        return count;


        // stack 풀이
        int answer = 0;
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {0, 0});

        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int index = current[0];
            int sum = current[1];

            if (index == numbers.length) {
                if (sum == target) {
                    answer++;
                }
            } else {
                stack.push(new int[] {index + 1, sum + numbers[index]});
                stack.push(new int[] {index + 1, sum - numbers[index]});
            }
        }

        return answer;
    }
}
