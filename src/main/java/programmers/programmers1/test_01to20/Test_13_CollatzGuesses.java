package programmers.programmers1.test_01to20;

public class Test_13_CollatzGuesses {
    public int solution(int num) {
        int count = 0;
        Long longNum = (long) num;
        while (longNum != 1) {
            if (longNum % 2 == 0) {
                longNum = longNum / 2;
                count++;
            } else {
                longNum = longNum * 3 + 1;
                count++;
            }
        }
        if (count >= 500) {
            count = -1;
        }
        return count;
    }
}
