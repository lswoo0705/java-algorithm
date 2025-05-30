package baekjoon.level11;

import java.io.*;

//MenOfPassion(A[], n) {
//    sum <- 0;
//    for i <- 1 to n
//    sum <- sum + A[i]; # 코드1
//    return sum;
//}

// 수행 횟수와 알고리즘의 최고차항의 차수를 출력

//int MenOfPassion(int[] A, int n) {
//    int sum = 0;
//    for (int i = 1; i <= n; i++) {
//        sum += A[i]; // 코드1
//    }
//    return sum;
//}

public class Test_02_RunningTimeOfAlgorithm2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // for문에 의해 알고리즘은 n번 실행된다.
        int n = Integer.parseInt(br.readLine());
        System.out.println(n);

        // n은 1차식이므로 1을 출력
        System.out.println(1);
    }
}
