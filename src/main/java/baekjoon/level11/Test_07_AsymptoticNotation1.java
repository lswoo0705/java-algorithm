package baekjoon.level11;

import java.io.*;
import java.util.StringTokenizer;

// a1, a0, c, n0가 주어질 때
// n0보다 큰 n들에 대해 f(n) <= c * g(n)이 항상 참인지를 확인하는 문제

// f(n) = a1 * n + a0 -> 실제 알고리즘 실행 시간
// g(n) = n -> Big-O(n)만 따질거라서 기준 함수는 항상 n
// c = 주어지는 상수
// n0 = 기준이 되는 n의 최소값

public class Test_07_AsymptoticNotation1 {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = toInt(st.nextToken());
        int a0 = toInt(st.nextToken());
        int c = toInt(br.readLine());
        int n0 = toInt(br.readLine());

        int answer = 1;

        for (int n = n0; n <= 100; n++) {
            int fn = a1 * n + a0;
            int gn = c * n;

            if (fn > gn) {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);
    }
}
