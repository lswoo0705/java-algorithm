package algorithm.programmers1.test_41to60;

import java.util.BitSet;

public class Test_55_FindingPrimeNumbers {
    public int solution(int n) {
        // 런타임에러 코드
//        int answer = 0;
//        for (int i = 2; i <= n; i++) {
//            boolean checkPrime = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    checkPrime = false;
//                    break;
//                }
//            }
//            if (checkPrime) {
//                answer++;
//            }
//        }
//        return answer;

        // 속도 개선 - 성공은 함
//        int answer = 0;
//        for(int i = 2; i <= n; i++){
//            int j = 2;
//            int count = 0;
//            while(j <= (int)Math.sqrt(i)){
//                if(i % j == 0){
//                    count += 1;
//                    break;
//                }
//                j += 1;
//            }
//            if(count == 0) answer += 1;
//        }
//        return answer;


        // BitSet 사용 - 속도 대폭 상승
        BitSet isPrime = new BitSet(n + 1);
        isPrime.set(2, n + 1);

        for (int i = 2; i * i <= n; i = isPrime.nextSetBit(i + 1)) {
            for (int j = i * i; j <= n; j += i) {
                isPrime.clear(j);
            }
        }

        return isPrime.cardinality();
    }
}
