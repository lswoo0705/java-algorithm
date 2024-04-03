package algorithm.programmers2.test_01to20;

import java.util.Arrays;
import java.util.Collections;

public class Test_03_CreateMinimun {
    public int solution(int[] A, int[] B) {
//        int answer = 0;
//
//        Arrays.sort(A);
//        Integer[] arrB = Arrays.stream(B).boxed().toArray(Integer[]::new);
//        Arrays.sort(arrB, Collections.reverseOrder());
//
//        for (int i = 0; i < A.length; i++) {
//            answer += A[i] * arrB[i];
//        }
//
//        return answer;

        // 시간초과

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length - (i + 1)];
        }

        return answer;
    }
}
