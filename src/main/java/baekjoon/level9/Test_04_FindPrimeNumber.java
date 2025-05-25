package baekjoon.level9;

import java.io.*;
import java.util.StringTokenizer;

public class Test_04_FindPrimeNumber {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    // 소수 판별에서 n에 루트값을 씌우면 과정을 절반으로 줄일 수 있음
    static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = toInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = toInt(st.nextToken());
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
