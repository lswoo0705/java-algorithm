package baekjoon.level3;

import java.io.*;
import java.util.StringTokenizer;

public class Test_09_APlusB8 {
    static int toInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = toInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = toInt(st.nextToken());
            int b = toInt(st.nextToken());
            int sum = a + b;

            bw.write("Case #" + (i + 1) + ": " + a + " + " + b + " = " + sum + "\n");
        }

        bw.flush();
        bw.close();
    }
}
