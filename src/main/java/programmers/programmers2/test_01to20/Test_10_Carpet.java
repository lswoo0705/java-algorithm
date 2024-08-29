package programmers.programmers2.test_01to20;

public class Test_10_Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = {3, 3};
        int totalCarpet = brown + yellow;
        answer[0] = (brown + yellow) / answer[1];
        answer[1] = (brown + yellow) / answer[0];

        for (int i = 3; i <= totalCarpet; i++) {
            if (totalCarpet % i == 0 &&
                    totalCarpet / i >= i &&
                    yellow == ((totalCarpet / i) - 2) * (i - 2)) {
                answer[0] = totalCarpet / i;
                answer[1] = i;
                break;
            }
        }

        return answer;
    }
}
