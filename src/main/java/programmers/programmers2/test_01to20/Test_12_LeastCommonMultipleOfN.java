//import java.util.HashMap;
//import java.util.Map;
//import java.util.Stack;
//
//public class Test_12_LeastCommonMultipleOfN {
//    public int solution(int[] arr) {
//        int answer = 1;
//        Stack<Integer> stack = new Stack<>();
//
//        while (!arrayArePrime(arr)) {
//            for (int i = 0; i < arr.length; i++) {
//                int divisor = 2;
//                while (arr[i] > 1) {
//                    if (arr[i] % divisor == 0) {
//                        stack.push(divisor);
//                        arr[i] /= divisor;
//                    } else {
//                        divisor++;
//                    }
//                }
//            }
//        }
//
//        // 모든 서로소들의 곱
//        while (!stack.isEmpty()) {
//            answer *= stack.pop();
//        }
//
//        return answer;
//    }
//
//    // 배열 내 모든 원소가 소수인지 판별
//    private boolean arrayArePrime(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            if (!isPrime(arr[i])) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    // 소수인지 판별
//    private boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                return false; // n을 i로 나누었을 때 나머지가 0이면 소수가 아님
//            }
//        }
//
//        return true; // 소수인 경우
//    }
//}
    // 코드가 개오래걸림


package programmers.programmers2.test_01to20;

import java.util.HashMap;
import java.util.Map;

public class Test_12_LeastCommonMultipleOfN {
    public int solution(int[] arr) {
        Map<Integer, Integer> primeCountMap = new HashMap<>();

        for (int num : arr) {
            Map<Integer, Integer> primeFactors = primeFactors(num);
            for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
                int prime = entry.getKey();
                int count = entry.getValue();
                primeCountMap.put(prime, Math.max(primeCountMap.getOrDefault(prime, 0), count));
            }
        }

        int lcm = 1;
        for (Map.Entry<Integer, Integer> entry : primeCountMap.entrySet()) {
            int prime = entry.getKey();
            int count = entry.getValue();
            lcm *= Math.pow(prime, count);
        }

        return lcm;
    }

    private Map<Integer, Integer> primeFactors(int num) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i <= num / i; i++) {
            while (num % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                num /= i;
            }
        }
        if (num > 1) {
            factors.put(num, factors.getOrDefault(num, 0) + 1);
        }
        return factors;
    }
}
