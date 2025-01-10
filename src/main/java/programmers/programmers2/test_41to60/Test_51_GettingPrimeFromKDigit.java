package programmers.programmers2.test_41to60;

public class Test_51_GettingPrimeFromKDigit {
    public int solution(int n, int k) {
        int answer = -1;
        String kNum = Integer.toString(n, k);
        String[] splitedKNum = kNum.split("0");

        for (String s : splitedKNum) {
            if (s.isEmpty()) {
                continue;
            }
            long num = Long.parseLong(s);
            if (isPrime(num)) {
                answer++;
            }
        }
        return answer;
    }

    private boolean isPrime(long num) {
        if (num < 2) return false;  // 0, 1은 소수가 아님
        for (long i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;  // 약수가 있으면 소수 아님
        }
        return true;
    }

}
