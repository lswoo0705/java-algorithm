package programmers.programmers2.test_61to80;

public class Test_66_DivideTheNumberCards {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = getArrGCD(arrayA); // 철수 카드의 최대공약수
        int gcdB = getArrGCD(arrayB); // 영희 카드의 최대공약수

        boolean isValidA = isValidDivisor(gcdA, arrayB);
        boolean isValidB = isValidDivisor(gcdB, arrayA);

        int answer = 0;
        if (isValidA) answer = Math.max(answer, gcdA);
        if (isValidB) answer = Math.max(answer, gcdB);

        return answer;
    }

    // 배열의 최대공약수를 구하는 함수
    private int getArrGCD(int[] arr) {
        int gcd = arr[0];
        for (int num : arr) {
            gcd = getNumGCD(gcd, num);
            if (gcd == 1) return 1; // 최대공약수가 1이면 더 이상 계산할 필요 없음
        }
        return gcd;
    }

    // 두 수의 최대공약수를 구하는 함수
    private int getNumGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 특정 숫자가 다른 배열의 모든 원소를 나누지 않는지 확인하는 함수
    private boolean isValidDivisor(int gcd, int[] arr) {
        for (int num : arr) {
            if (num % gcd == 0) return false;
        }
        return true;
    }
}
