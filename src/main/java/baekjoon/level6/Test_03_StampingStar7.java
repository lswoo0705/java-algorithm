package baekjoon.level6;

import java.io.*;

public class Test_03_StampingStar7 {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = toInt(br.readLine());
        String space = " ";
        String star = "*";

        for (int i = 0; i < n; i++) {
            bw.write(space.repeat(n - 1 - i)
                    + star.repeat(i * 2 + 1));
            bw.newLine();
        }

        for (int i = 1; i < n; i++) {
            bw.write(space.repeat(i)
                    + star.repeat((n - i) * 2 - 1));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
