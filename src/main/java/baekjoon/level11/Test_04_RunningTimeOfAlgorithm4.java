package baekjoon.level11;

import java.io.*;

//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n - 1
//    for j <- i + 1 to n
//    sum <- sum + A[i] × A[j]; # 코드1
//    return sum;
//}

//int menOfPassion(int[] A, int n) {
//    int sum = 0;
//    for (int i = 1; i <= n - 1; i++) {
//        for (int j = i + 1; j <= n; j++) {
//            sum += A[i] * A[j]; // 코드1
//        }
//    }
//    return sum;
//}

public class Test_04_RunningTimeOfAlgorithm4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Integer.parseInt(br.readLine());

        // n = 7일 때
        // i = 1   ->   j = 2, 3, 4, 5, 6, 7   ->   6번
        // i = 2   ->   j = 3, 4, 5, 6, 7   ->   5번
        // ...

        // n * (n - 1) / 2
        System.out.println(n * (n - 1) / 2);
        System.out.println(2);
    }
}
