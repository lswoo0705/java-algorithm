package baekjoon.level3;

import java.io.*;

public class Test_10_StampingStar1 {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = toInt(br.readLine());
        String star = "*";

        for (int i = 0; i < n; i++) {
            bw.write(star.repeat(i + 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
