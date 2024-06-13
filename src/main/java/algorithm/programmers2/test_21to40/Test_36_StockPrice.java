package algorithm.programmers2.test_21to40;

import java.util.Stack;

// 주식, 가격
public class Test_36_StockPrice {
    public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                answer[i]++;
//                if (prices[i] > prices[j]) {
//                    break;
//                }
//            }
//        }
//
//        return answer;


        // ---------------
        // stock, queue

        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }
}
