package programmers.programmers2.test_61to80;

import java.util.ArrayList;
import java.util.List;

public class Test_76_ExpressionMaximization {
    public long solution(String expression) {
        long maxResult = 0;

        // 모든 연산자 우선순위 조합을 순회
        for (String[] priority : PRIORITIES) {
            List<Long> numbers = new ArrayList<>(); // 숫자 리스트
            List<String> operators = new ArrayList<>(); // 연산자 리스트

            // 수식을 숫자와 연산자로 분리
            parseExpression(expression, numbers, operators);

            // 주어진 우선순위로 계산
            long result = calculateMax(numbers, operators, priority);
            // 최대 절댓값
            maxResult = Math.max(maxResult, result);
        }

        return maxResult;
    }

    // 연산자 우선순위의 모든 경우의 수 (총 6가지)
    private static final String[][] PRIORITIES = {
            {"+", "-", "*"}, {"+", "*", "-"},
            {"-", "+", "*"}, {"-", "*", "+"},
            {"*", "+", "-"}, {"*", "-", "+"}
    };

    // 수식을 숫자 와 연산자 리스트로 분리하는 메서드
    private void parseExpression(String expression, List<Long> numbers, List<String> operators) {
        // 현재 숫자를 저장
        StringBuilder num = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (ch == '+' || ch == '-' || ch == '*') { // 연산자를 발견할 시
                numbers.add(Long.parseLong(num.toString())); // 숫자 리스트에 추
                operators.add(String.valueOf(ch)); // 연산자 리스트에 추가
                num.setLength(0); // 숫자 저장 초기화
            } else {
                num.append(ch); // 숫자를 이어붙임
            }
        }
        numbers.add(Long.parseLong(num.toString())); // 마지막 숫자를 추가
    }

    // 주어진 우선순위에 따라 수식을 계산하는 메서드
    private long calculateMax(List<Long> numbers, List<String> operators, String[] priority) {
        // 원본을 유지하기 위해 각 리스트를 복사
        List<Long> numList = new ArrayList<>(numbers);
        List<String> opList = new ArrayList<>(operators);

        // 우선순위에 따라 연산
        for (String op : priority) {
            for (int i = 0; i < opList.size(); ) {
                if (opList.get(i).equals(op)) { // 현재 우선순위 연산자와 일치할 경우에만 연산
                    long calculatedValue = applyOperation(numList.get(i), numList.get(i + 1), op);
                    numList.set(i, calculatedValue); // 결과값을 저장
                    numList.remove(i + 1); // 이미 연산을 했으므로 다음 숫자는 제거
                    opList.remove(i); // 사용한 연산자 제거
                } else {
                    i++; // 현재 연산자가 아니라면 다음 연산자로
                }
            }
        }
        return Math.abs(numList.get(0));
    }

    // 삼칙연산 수행 메서드
    private long applyOperation(long a, long b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Invalid operator: " + op);
        };
    }
}
