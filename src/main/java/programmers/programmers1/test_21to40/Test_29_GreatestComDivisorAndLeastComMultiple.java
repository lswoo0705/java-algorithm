package programmers.programmers1.test_21to40;

public class Test_29_GreatestComDivisorAndLeastComMultiple {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int lowNum = 0;
        int gCD = 0;
        int lCM = 0;
        // 최대공약수를 구하기 위해 n, m 중 작은 수 찾기
        lowNum = Math.min(n, m);
        // 최대공약수 구하기
        for (int i = 1; i <= lowNum; i++) {
            if (n % i == 0 && m % i == 0) {
                gCD = i;
            }
        }
        // 최소공배수 구하기
        lCM = n * m / gCD;

        answer[0] = gCD;
        answer[1] = lCM;

        return answer;
    }
}
