package baekjoon.level9;

import java.io.*;

public class Test_03_SumOfDivisors {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    // 완전수인지 확인
    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int n = toInt(br.readLine());
            if (n == -1) {
                break;
            }

            // 완전수라면 작성
            if (isPerfect(n)) {
                StringBuilder str = new StringBuilder();
                str.append(n).append(" = ");
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        str.append(i).append(" + ");
                    }
                }
                bw.write(str.substring(0, str.length() - 3));
            } else {
                bw.write(n + " is NOT perfect.");
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
