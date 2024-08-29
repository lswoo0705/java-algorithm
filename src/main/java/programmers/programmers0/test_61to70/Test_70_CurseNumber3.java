package programmers.programmers0.test_61to70;

public class Test_70_CurseNumber3 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++; // 1부터 시작
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) { // 3으로 나누어 떨어지거나, 3이 포함될때마다
                answer++; // 1을 더한다
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Test_70_CurseNumber3 sol = new Test_70_CurseNumber3();
        int n = 15; // 25
//        int n = 40; // 76
        System.out.println(sol.solution(n));
    }
}
