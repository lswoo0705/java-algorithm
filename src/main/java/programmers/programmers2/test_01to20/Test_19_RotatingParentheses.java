package programmers.programmers2.test_01to20;

import java.util.Stack;

public class Test_19_RotatingParentheses {
    public int solution(String s) {
        int answer = 0;

        // 괄호가 유효한지 검사
        for (int i = 0; i < s.length(); i++) {
            if (isValid(s)) {
                answer++;
            }
            // 문자열 왼쪽으로 회전
            s = s.substring(1) + s.charAt(0);
        }

        return answer;
    }

    // 올바른 괄호 문자열인지 검사하는 함수
    private boolean isValid(String s) {
        Stack<Character> stackS = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stackS.push(c);
            } else {
                if (stackS.isEmpty()) {
                    // 비어있을 때 닫는괄호가 나온다면 false
                    return false;
                }
                char top = stackS.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    // 괄호가 알맞지 않을 경우 false
                    return false;
                }
            }
        }

        return stackS.isEmpty();
    }
}
