package algorithm.programmers.Test_21to30;

public class Test_28_BacterialGrowth {
    public int solution(int n, int t) {
        int answer = 0;
        int time = 1;
        for (int i = 0; i < t; i++) {
            time = 2 * time;
        }
        answer = n * time;
        return answer;
    }
}