package algorithm.programmers2.test_01to20;

import java.util.Stack;

public class Test_04_CorrectParentheses {
    boolean solution(String s) {
//        int openCount = 0;
//        int closeCount = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                openCount++;
//            } else {
//                closeCount++;
//            }
//        }
//
//        return openCount == closeCount;
        // 숫자만 세는게 아니라 열리고나서 닫혀야됨


//        int openCount = 0;
//        int closeCount = 0;
//
//        if (s.charAt(0) == ')') {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                openCount++;
//            } else {
//                closeCount++;
//            }
//        }
//
//        return openCount == closeCount;
        // 정확성 테스트 케이스 4, 5, 11, 18 실패
        // 효율성 테스트 통과


//        int openCount = 0;
//        int closeCount = 0;
//
//        if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                openCount++;
//            } else {
//                closeCount++;
//            }
//        }
//
//        return openCount == closeCount;
        // 정확성 테스트 케이스 5, 11 실패
        // 효율성 테스트 통과

        // 검색해보니 ())(()와 같은 경우 여는것과 닫히는 것이 일치하지 못함
        // 완전 다른 접근이 필요

//        while (s.contains("()")) {
//            s = s.replace("()", "");
//        }
//
//        return s.isEmpty();
        // 정확성 테스트 성공
        // 효율성 테스트 전부 실패...
        // replace가 치환하는 과정에서 많은 메모리 소요


//        int isParentheses = 0;
//
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                isParentheses++;
//            } else {
//                if (isParentheses == 0) {
//                    return false;
//                }
//                isParentheses--;
//            }
//        }
//
//        return isParentheses == 0;
        // 정확성 테스트 성공
        // 효율성 테스트 성공

        // 추가적으로 stack을 사용해서 해결해보기

        Stack<Character> stackS = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stackS.push(c);
            } else {
                if (stackS.isEmpty()) {
                    return false;
                }
                stackS.pop();
            }
        }
        return stackS.isEmpty();
    }

    public static void main(String[] args) {
        Test_04_CorrectParentheses sol = new Test_04_CorrectParentheses();
//        String s = "()()";
        String s = "(())()";
//        String s = ")()(";
        System.out.println(sol.solution(s));
    }
}
