package algorithm.programmers0.test_81to100;

public class Test_89_GreaterCombination {
    public int solution(int a, int b) {
        String ab = a + String.valueOf(b);
        String ba = b + String.valueOf(a);
        return Math.max(Integer.parseInt(ab), Integer.parseInt(ba));
    }
}
