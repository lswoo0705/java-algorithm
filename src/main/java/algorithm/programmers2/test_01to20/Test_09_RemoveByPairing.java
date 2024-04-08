package algorithm.programmers2.test_01to20;

import java.util.Stack;

public class Test_09_RemoveByPairing {
    public int solution(String s) {
//        StringBuilder str = new StringBuilder(s);
//
//        while (true) {
//            boolean removed = false;
//
//            for (int i = 0; i < str.length() - 1; i++) {
//                if (str.charAt(i) == str.charAt(i + 1)) {
//                    str.delete(i, i + 2);
//                    removed = true;
//                    break;
//                }
//            }
//
//            if (!removed) {
//                break;
//            }
//        }
//
//        return str.length() == 0 ? 1 : 0;
        // 정확성 테스트 성공
        // 효율성 테스트 실패


        // 스택을 이용해 peek으로 문자열과 비교
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        Test_09_RemoveByPairing sol = new Test_09_RemoveByPairing();
        String s = "baabaa";
//        String s = "cdcd";
        System.out.println(sol.solution(s));
    }
}
