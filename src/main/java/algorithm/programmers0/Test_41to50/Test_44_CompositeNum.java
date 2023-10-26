package algorithm.programmers0.Test_41to50;

public class Test_44_CompositeNum {
    public int solution(int n) {
        int answer = 0;
        for (int i = 4; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    count ++;
                }
            }
            if (count >= 3) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_44_CompositeNum sol = new Test_44_CompositeNum();
        int n = 10;
        System.out.println(sol.solution(n));
    }
}
