package algorithm.programmers1.test_01to20;

public class Test_23_NumOfDivisorAndAddition {
    public int solution(int left, int right) {
        int answer = 0;
        // 레프트부터 라이트까지
        for (int i = left; i <= right; i++) {
            // 타겟넘버의 약수의 개수
            int numOfDivisor = 0;
            // 약수의 개수 구하기
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    numOfDivisor++;
                }
            }
            // 약수의 개수에 따라서 answer에 더하기
            if (numOfDivisor % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Test_23_NumOfDivisorAndAddition sol = new Test_23_NumOfDivisorAndAddition();
        int left = 13;
        int right = 17;
        System.out.println(sol.solution(left, right));
    }
}
