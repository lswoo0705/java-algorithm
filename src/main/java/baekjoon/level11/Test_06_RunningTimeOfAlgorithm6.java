package baekjoon.level11;

import java.io.*;

//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n - 2
//    for j <- i + 1 to n - 1
//    for k <- j + 1 to n
//    sum <- sum + A[i] × A[j] × A[k]; # 코드1
//    return sum;
//}

//public static int MenOfPassion(int[] A, int n) {
//    int sum = 0;
//    for (int i = 1; i <= n - 2; i++) {
//        for (int j = i + 1; j <= n - 1; j++) {
//            for (int k = j + 1; k <= n; k++) {
//                sum += A[i] * A[j] * A[k]; // 코드1
//            }
//        }
//    }
//    return sum;
//}

// 1부터 n까지의 숫자들 중 서로 다른 3개의 숫자를 뽑고 오름차순 정렬
// nC3 = n! / (3! * (n - 3)!) = n * (n - 1) * (n - 2) / 6

public class Test_06_RunningTimeOfAlgorithm6 {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = toInt(br.readLine());

        System.out.println(n * (n - 1) * (n - 2) / 6);
        System.out.println(3);
    }
}
