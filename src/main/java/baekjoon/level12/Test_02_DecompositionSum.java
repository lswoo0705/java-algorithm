package baekjoon.level12;

import java.io.*;

public class Test_02_DecompositionSum {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = toInt(br.readLine());

        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int sum = i;
            int temp = i;

            // 각 자리수 더하기
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == N) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
