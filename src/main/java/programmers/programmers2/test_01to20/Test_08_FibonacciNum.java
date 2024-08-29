package programmers.programmers2.test_01to20;

public class Test_08_FibonacciNum {
    public int solution(int n) {
//        int answer = 0;
//
//        for (int i = 1; i <= n; i++) {
//            answer = fibonacci(i);
//        }
//
//        return answer;
//    }
//
//    private int fibonacci(int n) {
//        int firstFibonacci = 1;
//        int secondFibonacci = 1;
//        int fibonacci = 0;
//        int count = 0;
//
//        count++;
//        fibonacci = fibonacci(firstFibonacci) + fibonacci(secondFibonacci);
//
//        if (count == n) {
//            return fibonacci % 1234567;
//        }


        int firstFibonacci = 1;
        int secondFibonacci = 1; // n = 2 일 때 바로 반환

        // n번째 피보나치 수 구하기
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                int nextFibonacci = (firstFibonacci + secondFibonacci) % 1234567;
                firstFibonacci = secondFibonacci;
                secondFibonacci = nextFibonacci;
            }
        }

        return secondFibonacci;

    }
}
