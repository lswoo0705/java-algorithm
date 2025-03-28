package programmers.programmers2.test_61to80;

import java.util.ArrayList;
import java.util.List;

public class Test_76_ExpressionMaximization {
    public long solution(String expression) {
        long maxResult = 0;

        for (String[] priority : PRIORITIES) {
            List<Long> numbers = new ArrayList<>();
            List<String> operators = new ArrayList<>();

            parseExpression(expression, numbers, operators);

            long result = calculateMax(numbers, operators, priority);
            maxResult = Math.max(maxResult, result);
        }

        return maxResult;
    }

    private static final String[][] PRIORITIES = {
            {"+", "-", "*"}, {"+", "*", "-"},
            {"-", "+", "*"}, {"-", "*", "+"},
            {"*", "+", "-"}, {"*", "-", "+"}
    };

    private void parseExpression(String expression, List<Long> numbers, List<String> operators) {
        StringBuilder num = new StringBuilder();

        for (char ch : expression.toCharArray()) {
            if (ch == '+' || ch == '-' || ch == '*') {
                numbers.add(Long.parseLong(num.toString()));
                operators.add(String.valueOf(ch));
                num.setLength(0);
            } else {
                num.append(ch);
            }
        }
        numbers.add(Long.parseLong(num.toString()));
    }

    private long calculateMax(List<Long> numbers, List<String> operators, String[] priority) {
        List<Long> numList = new ArrayList<>(numbers);
        List<String> opList = new ArrayList<>(operators);

        for (String op : priority) {
            for (int i = 0; i < opList.size(); ) {
                if (opList.get(i).equals(op)) {
                    long calculatedValue = applyOperation(numList.get(i), numList.get(i + 1), op);
                    numList.set(i, calculatedValue);
                    numList.remove(i + 1);
                    opList.remove(i);
                } else {
                    i++;
                }
            }
        }
        return Math.abs(numList.get(0));
    }

    private long applyOperation(long a, long b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}
