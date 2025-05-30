package baekjoon.level11;

import java.io.*;

//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n
//    for j <- 1 to n
//    for k <- 1 to n
//    sum <- sum + A[i] × A[j] × A[k]; # 코드1
//    return sum;
//}

//int MenOfPassion(int[] A, int n) {
//    int sum = 0;
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n; j++) {
//            for (int k = 1; k <= n; k++) {
//                sum += A[i] * A[j] * A[k]; // 코드1
//            }
//        }
//    }
//    return sum;
//}

public class Test_05_RunningTimeOfAlgorithm5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        // n = 5라면
        // i = 1 ~ 5 // j = 1 ~ 5 // k = 1 ~ 5
        System.out.println(n * n * n);
        System.out.println(3);
    }
}
