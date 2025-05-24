package baekjoon.level9;

import java.io.*;
import java.util.StringTokenizer;

public class Test_02_FindingDivisors {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = toInt(st.nextToken());
        int K = toInt(st.nextToken());
        int num = 0;

        for (int i = 0; i < N; i++) {
            if (N % (i + 1) == 0) {
                num++;
                if (num == K) {
                    System.out.println(i + 1);
                    return;
                }
            }
        }

        System.out.println(0);
    }
}
