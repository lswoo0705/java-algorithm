package algorithm.programmers0.test_141to160;

public class Test_146_CalculateSimpleExpression {
    public int solution(String binomial) {
        String[] binomialArr = binomial.split(" ");

        if (binomialArr[1].equals("+")) {
            return Integer.parseInt(binomialArr[0]) + Integer.parseInt(binomialArr[2]);
        } else if (binomialArr[1].equals("-")) {
            return Integer.parseInt(binomialArr[0]) - Integer.parseInt(binomialArr[2]);
        }

        return Integer.parseInt(binomialArr[0]) * Integer.parseInt(binomialArr[2]);
    }
}
