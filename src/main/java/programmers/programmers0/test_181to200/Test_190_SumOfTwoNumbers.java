package programmers.programmers0.test_181to200;

import java.math.BigInteger;

public class Test_190_SumOfTwoNumbers {
    public String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);

        BigInteger sum = numA.add(numB);

        return sum.toString();
    }
}
