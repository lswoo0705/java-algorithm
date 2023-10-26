package algorithm.programmers0.Test_01to20;

public class Test_15_ConditionOfTriangle {
    public int solution(int[] sides) {
        int answer = 0;
        if (sides[0] < sides[1] + sides[2]) {
            if (sides[1] < sides[0] + sides[2]) {
                if (sides[2] < sides[1] + sides[0]) {
                    answer = 1;
                } else {
                    answer = 2;
                }
            } else {
                answer = 2;
            }
        } else {
            answer = 2;
        }

        return answer;
    }
}
