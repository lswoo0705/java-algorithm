package programmers.programmers2.test_41to60;

import java.util.HashSet;

public class Test_46_FindPrimeNumber {
    public int solution(String numbers) {
        // 소수의 중복을 피하기 위해 HashSet 사용
        HashSet<Integer> primes = new HashSet<>();
        // 가능한 숫자 조합을 생성하고 primes에 추가
        permutation("", numbers, primes);

        // 소수의 개수
        int count = 0;
        // HashSet의 모든 숫자에 대해 소수인지 확인
        for (int num : primes) {
            if (isPrime(num)) {
                count++;
            }
        }

        // 소수 개수 반환
        return count;
    }

    // 생성된 숫자와 남은 숫자를 받아 모든 조합을 생성하는 함수
    private void permutation(String prefix, String remaining, HashSet<Integer> primes) {
        int len = remaining.length();
        if (!prefix.isEmpty()) {
            // 조합이 비어있지 않다면 정수로 변환하여 HashSet에 추가
            primes.add(Integer.valueOf(prefix));
        }
        for (int i = 0; i < len; i++) {
            // 새로운 조합 생성
            permutation(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), primes);
        }
    }

    // 소수인지 판별하는 함수
    private boolean isPrime(int num) {
        // 0 or 1 은 소수가 아님
        if (num <= 1) {
            return false;
        }
        // 2는 소수
        if (num == 2) {
            return true;
        }
        // 짝수는 소수가 아님
        if (num % 2 == 0) {
            return false;
        }
        // 제곱근까지 홀수로 나누어 떨어지는지 확인
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        // 위 조건을 모두 통과한다면 소수
        return true;
    }
}
