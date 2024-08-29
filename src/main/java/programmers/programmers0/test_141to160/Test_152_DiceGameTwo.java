package programmers.programmers0.test_141to160;

// 주사위 게임 2
public class Test_152_DiceGameTwo {
    public int solution(int a, int b, int c) {
        int answer = 0;

        if (a != b && a != c && b != c) {
            answer = a + b + c;
        } else if (a == b && a == c) {
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }

        return answer;
    }
}
