package algorithm.programmers0.test_81to100;

public class Test_85_CommonMultiple {
    public int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
