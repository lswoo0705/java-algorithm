package baekjoon.level11;

import java.io.*;

//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n
//    for j <- 1 to n
//    sum <- sum + A[i] × A[j]; # 코드1
//    return sum;
//}

//int MenOfPassion(int[] A, int n) {
//    int sum = 0;
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n; j++) {
//            sum += A[i] * A[j]; // 코드1
//        }
//    }
//    return sum;
//}

public class Test_03_RunningTimeOfAlgorithm3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2중 for문에 의해 알고리즘은 n^2번 실행된다.
        long n = Integer.parseInt(br.readLine());
        System.out.println(n * n);

        // n^2은 2차식이므로
        System.out.println(2);
    }
}
